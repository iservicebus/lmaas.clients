# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**chatCompletionChatCompletionPost**](DefaultApi.md#chatCompletionChatCompletionPost) | **POST** /chat/completion | Chat Completion |


<a id="chatCompletionChatCompletionPost"></a>
# **chatCompletionChatCompletionPost**
> Object chatCompletionChatCompletionPost(chatCompletionReq)

Chat Completion

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ChatCompletionReq chatCompletionReq = new ChatCompletionReq(); // ChatCompletionReq | 
    try {
      Object result = apiInstance.chatCompletionChatCompletionPost(chatCompletionReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#chatCompletionChatCompletionPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatCompletionReq** | [**ChatCompletionReq**](ChatCompletionReq.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

