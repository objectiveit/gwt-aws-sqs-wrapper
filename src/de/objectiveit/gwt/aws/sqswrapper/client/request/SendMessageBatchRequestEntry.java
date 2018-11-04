package de.objectiveit.gwt.aws.sqswrapper.client.request;

import jsinterop.annotations.JsProperty;

public class SendMessageBatchRequestEntry {

	@JsProperty(name = "MessageBody")
	private String messageBody;

	@JsProperty(name = "Id")
	private String id;

	@JsProperty(name = "MessageDeduplicationId")
	private String messageDeduplicationId;

	@JsProperty(name = "MessageGroupId")
	private String messageGroupId;

	public SendMessageBatchRequestEntry(String id, String messageBody) {
		this();
		this.setId(id);
		this.setMessageBody(messageBody);
	}

	public SendMessageBatchRequestEntry() {
		super();
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getMessageDeduplicationId() {
		return messageDeduplicationId;
	}

	public void setMessageDeduplicationId(String messageDeduplicationId) {
		this.messageDeduplicationId = messageDeduplicationId;
	}

	public String getMessageGroupId() {
		return messageGroupId;
	}

	public void setMessageGroupId(String messageGroupId) {
		this.messageGroupId = messageGroupId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
