package org.gwtopenmaps.openlayers.client.handler;

import org.gwtopenmaps.openlayers.client.util.JSObject;

public class ClickHandlerOptions extends HandlerOptions {

	protected ClickHandlerOptions(JSObject jsObject) {
		super(jsObject);
	}

	public ClickHandlerOptions() {
		this(JSObject.createJSObject());
	}
	
	public void setDelay(int milliseconds) {
		getJSObject().setProperty("delay", milliseconds);
	}
	
	public void setSingleClick(boolean willHandle) {
		getJSObject().setProperty("single", willHandle);
	}

	public void setDoubleClick(boolean willHandle) {
		getJSObject().setProperty("double", willHandle);
	}

	public void setPixelTolerance(int tolerance) {
		getJSObject().setProperty("pixelTolerance", tolerance);
	}

	public void setStopSingleClick(boolean stopEvent) {
		getJSObject().setProperty("stopSingle", stopEvent);
	}

	public void setStopDoubleClick(boolean stopEvent) {
		getJSObject().setProperty("stopDouble", stopEvent);
	}

}
