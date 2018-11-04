package de.objectiveit.gwt.aws.sqswrapper.client;

import com.google.gwt.core.shared.GWT;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface IResponse {

	public void respond(String error, String data);
}

final class ListQueuesResponse implements IResponse {

	@Override
	public void respond(String error, String data) {
		GWT.log(error);
		GWT.log(data);
	}

}
