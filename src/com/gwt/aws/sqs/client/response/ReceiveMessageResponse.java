package com.gwt.aws.sqs.client.response;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsProperty;

@JsFunction
@FunctionalInterface
public interface ReceiveMessageResponse {

	public void response(String error, ReceiveMessageResult data);

	public static class ReceiveMessageResult {

		@JsProperty(name = "Messages")
		public native SQSMessage[] getMessages();
	}
}
