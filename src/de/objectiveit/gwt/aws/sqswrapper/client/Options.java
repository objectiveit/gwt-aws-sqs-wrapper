package de.objectiveit.gwt.aws.sqswrapper.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Options {

	@JsProperty
	public String region;
	@JsProperty
	public AWSCredentials credentials ;

	
	public Options(AWSCredentials credentials, String region) {
		super();
		this.credentials = credentials;
		this.region = region;
	}

}
