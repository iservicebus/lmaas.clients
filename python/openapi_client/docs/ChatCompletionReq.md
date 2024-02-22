# ChatCompletionReq


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_tokens** | [**MaxTokens**](MaxTokens.md) |  | [optional] 
**temperature** | **float** |  | [optional] [default to 0.2]
**top_p** | **float** |  | [optional] [default to 0.95]
**stop** | [**Stop**](Stop.md) |  | [optional] 
**model** | [**Model**](Model.md) |  | [optional] 
**id** | **str** |  | [optional] [default to '5ffa5d5b-5faa-4f6b-bf43-5dcecf932269']
**req_time** | **datetime** |  | [optional] 
**text_list** | [**ChatTextList**](ChatTextList.md) |  | 

## Example

```python
from openapi_client.models.chat_completion_req import ChatCompletionReq

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionReq from a JSON string
chat_completion_req_instance = ChatCompletionReq.from_json(json)
# print the JSON string representation of the object
print ChatCompletionReq.to_json()

# convert the object into a dict
chat_completion_req_dict = chat_completion_req_instance.to_dict()
# create an instance of ChatCompletionReq from a dict
chat_completion_req_form_dict = chat_completion_req.from_dict(chat_completion_req_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


