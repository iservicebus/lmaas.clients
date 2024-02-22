# ChatTextList

Represents a collection of messages in a conversation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**List[ChatText]**](ChatText.md) |  | [optional] [default to []]

## Example

```python
from openapi_client.models.chat_text_list import ChatTextList

# TODO update the JSON string below
json = "{}"
# create an instance of ChatTextList from a JSON string
chat_text_list_instance = ChatTextList.from_json(json)
# print the JSON string representation of the object
print ChatTextList.to_json()

# convert the object into a dict
chat_text_list_dict = chat_text_list_instance.to_dict()
# create an instance of ChatTextList from a dict
chat_text_list_form_dict = chat_text_list.from_dict(chat_text_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


