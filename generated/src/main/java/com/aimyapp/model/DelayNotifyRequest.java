package com.aimyapp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DelayNotifyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-06-28T15:16:53.729415900+09:00[Asia/Tokyo]", comments = "Generator version: 7.23.0")
public class DelayNotifyRequest {

  private String from;

  private String to;

  public DelayNotifyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DelayNotifyRequest(String from, String to) {
    this.from = from;
    this.to = to;
  }

  public DelayNotifyRequest from(String from) {
    this.from = from;
    return this;
  }

  /**
   * 出発駅
   * @return from
   */
  @NotNull 
  @Schema(name = "from", example = "東京", description = "出発駅", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  @JsonProperty("from")
  public void setFrom(String from) {
    this.from = from;
  }

  public DelayNotifyRequest to(String to) {
    this.to = to;
    return this;
  }

  /**
   * 到着駅
   * @return to
   */
  @NotNull 
  @Schema(name = "to", example = "新宿", description = "到着駅", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("to")
  public String getTo() {
    return to;
  }

  @JsonProperty("to")
  public void setTo(String to) {
    this.to = to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelayNotifyRequest delayNotifyRequest = (DelayNotifyRequest) o;
    return Objects.equals(this.from, delayNotifyRequest.from) &&
        Objects.equals(this.to, delayNotifyRequest.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelayNotifyRequest {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

