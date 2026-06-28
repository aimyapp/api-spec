# API Specification

OpenAPIを利用したAPI定義リポジトリです。

## 環境

- Java 17
- Node.js
- OpenAPI Generator CLI 7.23.0

## ディレクトリ構成

```text
.
├── openapi.yaml     # API定義
├── config.yaml      # Generator設定
└── generated/       # 生成されたJavaコード
```

## API定義の編集

API定義は `openapi.yaml` を編集してください。

## Javaコード生成

```bash
openapi-generator-cli generate -i openapi.yaml -g spring -c config.yaml -o generated
```

生成後、以下が更新されます。

- API Interface
- Modelクラス

## 利用方法

本リポジトリで生成したJavaコードをライブラリとして利用します。

実装側プロジェクトでは、生成されたAPI Interfaceを実装してください。

```java
@RestController
public class HelloController implements HelloApi {

    @Override
    public ResponseEntity<HelloResponse> hello() {
        HelloResponse response = new HelloResponse();
        response.setMessage("Hello World");
        return ResponseEntity.ok(response);
    }
}
```

## 注意事項

- `generated` 配下は自動生成コードです。
- 手動で編集しないでください。
- API定義を変更した場合は再生成してください。