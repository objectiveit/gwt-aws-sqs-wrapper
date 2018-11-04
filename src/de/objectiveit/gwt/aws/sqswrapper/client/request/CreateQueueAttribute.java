package de.objectiveit.gwt.aws.sqswrapper.client.request;

import jsinterop.annotations.JsProperty;


public class CreateQueueAttribute {
	@JsProperty(name = "Policy")
	private String Policy;
	@JsProperty(name = "VisibilityTimeout")
	private String visibilityTimeout;
	@JsProperty(name = "MaximumMessageSize")
	private String maximumMessageSize;
	@JsProperty(name = "MessageRetentionPeriod")
	private String messageRetentionPeriod;
	@JsProperty(name = "ApproximateNumberOfMessages")
	private String approximateNumberOfMessages;
	@JsProperty(name = "ApproximateNumberOfMessagesNotVisible")
	private String approximateNumberOfMessagesNotVisible;
	@JsProperty(name = "CreatedTimestamp")
	private String createdTimestamp;
	@JsProperty(name = "LastModifiedTimestamp")
	private String lastModifiedTimestamp;
	@JsProperty(name = "QueueArn")
	private String queueArn;
	@JsProperty(name = "ApproximateNumberOfMessagesDelayed")
	private String approximateNumberOfMessagesDelayed;
	@JsProperty(name = "DelaySeconds")
	private String delaySeconds;
	@JsProperty(name = "ReceiveMessageWaitTimeSeconds")
	private String ReceiveMessageWaitTimeSeconds;
	@JsProperty(name = "RedrivePolicy")
	private String redrivePolicy;
	@JsProperty(name = "FifoQueue")
	private boolean fifoQueue;
	@JsProperty(name = "ContentBasedDeduplication")
	private String contentBasedDeduplication;
	@JsProperty(name = "KmsMasterKeyId")
	private String kmsMasterKeyId;
	@JsProperty(name = "KmsDataKeyReusePeriodSeconds")
	private String kmsDataKeyReusePeriodSeconds;

	public String getPolicy() {
		return Policy;
	}

	public void setPolicy(String policy) {
		Policy = policy;
	}

	public String getVisibilityTimeout() {
		return visibilityTimeout;
	}

	public void setVisibilityTimeout(String visibilityTimeout) {
		this.visibilityTimeout = visibilityTimeout;
	}

	public String getMaximumMessageSize() {
		return maximumMessageSize;
	}

	public void setMaximumMessageSize(String maximumMessageSize) {
		this.maximumMessageSize = maximumMessageSize;
	}

	public String getMessageRetentionPeriod() {
		return messageRetentionPeriod;
	}

	public void setMessageRetentionPeriod(String messageRetentionPeriod) {
		this.messageRetentionPeriod = messageRetentionPeriod;
	}

	public String getApproximateNumberOfMessages() {
		return approximateNumberOfMessages;
	}

	public void setApproximateNumberOfMessages(String approximateNumberOfMessages) {
		this.approximateNumberOfMessages = approximateNumberOfMessages;
	}

	public String getApproximateNumberOfMessagesNotVisible() {
		return approximateNumberOfMessagesNotVisible;
	}

	public void setApproximateNumberOfMessagesNotVisible(String approximateNumberOfMessagesNotVisible) {
		this.approximateNumberOfMessagesNotVisible = approximateNumberOfMessagesNotVisible;
	}

	public String getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getLastModifiedTimestamp() {
		return lastModifiedTimestamp;
	}

	public void setLastModifiedTimestamp(String lastModifiedTimestamp) {
		this.lastModifiedTimestamp = lastModifiedTimestamp;
	}

	public String getQueueArn() {
		return queueArn;
	}

	public void setQueueArn(String queueArn) {
		this.queueArn = queueArn;
	}

	public String getApproximateNumberOfMessagesDelayed() {
		return approximateNumberOfMessagesDelayed;
	}

	public void setApproximateNumberOfMessagesDelayed(String approximateNumberOfMessagesDelayed) {
		this.approximateNumberOfMessagesDelayed = approximateNumberOfMessagesDelayed;
	}

	public String getDelaySeconds() {
		return delaySeconds;
	}

	public void setDelaySeconds(String delaySeconds) {
		this.delaySeconds = delaySeconds;
	}

	public String getReceiveMessageWaitTimeSeconds() {
		return ReceiveMessageWaitTimeSeconds;
	}

	public void setReceiveMessageWaitTimeSeconds(String receiveMessageWaitTimeSeconds) {
		ReceiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
	}

	public String getRedrivePolicy() {
		return redrivePolicy;
	}

	public void setRedrivePolicy(String redrivePolicy) {
		this.redrivePolicy = redrivePolicy;
	}

	public boolean isFifoQueue() {
		return fifoQueue;
	}

	public void setFifoQueue(boolean fifoQueue) {
		this.fifoQueue = fifoQueue;
	}

	public String getContentBasedDeduplication() {
		return contentBasedDeduplication;
	}

	public void setContentBasedDeduplication(String contentBasedDeduplication) {
		this.contentBasedDeduplication = contentBasedDeduplication;
	}

	public String getKmsMasterKeyId() {
		return kmsMasterKeyId;
	}

	public void setKmsMasterKeyId(String kmsMasterKeyId) {
		this.kmsMasterKeyId = kmsMasterKeyId;
	}

	public String getKmsDataKeyReusePeriodSeconds() {
		return kmsDataKeyReusePeriodSeconds;
	}

	public void setKmsDataKeyReusePeriodSeconds(String kmsDataKeyReusePeriodSeconds) {
		this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
	}
}
