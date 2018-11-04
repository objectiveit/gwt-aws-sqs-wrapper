package de.objectiveit.gwt.aws.sqswrapper.client.request;

import jsinterop.annotations.JsProperty;

public class SendMessageRequest {
	@JsProperty(name = "MessageBody")
	private String messageBody;

	@JsProperty(name = "QueueUrl")
	private String queueUrl;

	@JsProperty(name = "DelaySeconds")
	private Integer delaySeconds;

	@JsProperty(name = "MessageDeduplicationId")
	private String messageDeduplicationId;

	@JsProperty(name = "MessageGroupId")
	private String messageGroupId;
	
	public SendMessageRequest(String queueUrl, String messageBody) {
		this();
		this.setQueueUrl(queueUrl);
		this.setMessageBody(messageBody);
	}

	public SendMessageRequest() {
		super();
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getQueueUrl() {
		return queueUrl;
	}

	public void setQueueUrl(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	public Integer getDelaySeconds() {
		return delaySeconds;
	}

	public void setDelaySeconds(Integer delaySeconds) {
		this.delaySeconds = delaySeconds;
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
}
