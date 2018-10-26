package com.gwt.aws.sqs.client.request;

import jsinterop.annotations.JsProperty;

public class CreateQueueRequest {

	@JsProperty(name = "QueueName")
	private String queueName;

	@JsProperty(name = "Attributes")
	private CreateQueueAttribute attributes = new CreateQueueAttribute();

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public CreateQueueAttribute getAttributes() {
		return attributes;
	}

	public void setAttributes(CreateQueueAttribute attributes) {
		this.attributes = attributes;
	}

}
