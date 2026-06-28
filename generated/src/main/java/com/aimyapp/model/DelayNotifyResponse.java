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
 * DelayNotifyResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-06-28T15:16:53.729415900+09:00[Asia/Tokyo]", comments = "Generator version: 7.23.0")
public class DelayNotifyResponse {

  private String result;

  public DelayNotifyResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DelayNotifyResponse(String result) {
    this.result = result;
  }

  public DelayNotifyResponse result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @NotNull 
  @Schema(name = "result", example = "SUCCESS", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  @JsonProperty("result")
  public void setResult(String result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelayNotifyResponse delayNotifyResponse = (DelayNotifyResponse) o;
    return Objects.equals(this.result, delayNotifyResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelayNotifyResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

