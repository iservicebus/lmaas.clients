# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ChatCompletionChatCompletionPost**](DefaultApi.md#chatcompletionchatcompletionpost) | **POST** /chat/completion | Chat Completion |

<a id="chatcompletionchatcompletionpost"></a>
# **ChatCompletionChatCompletionPost**
> Object ChatCompletionChatCompletionPost (ChatCompletionReq chatCompletionReq)

Chat Completion

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ChatCompletionChatCompletionPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            var apiInstance = new DefaultApi(config);
            var chatCompletionReq = new ChatCompletionReq(); // ChatCompletionReq | 

            try
            {
                // Chat Completion
                Object result = apiInstance.ChatCompletionChatCompletionPost(chatCompletionReq);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.ChatCompletionChatCompletionPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ChatCompletionChatCompletionPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Chat Completion
    ApiResponse<Object> response = apiInstance.ChatCompletionChatCompletionPostWithHttpInfo(chatCompletionReq);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.ChatCompletionChatCompletionPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **chatCompletionReq** | [**ChatCompletionReq**](ChatCompletionReq.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

