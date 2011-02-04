package org.gwtopenmaps.openlayers.client.handler;

import org.gwtopenmaps.openlayers.client.util.JSObject;

public class ClickHandlerImpl {
	
	public static native JSObject create() /*-{
		return $wnd.OpenLayers.Handler.Click;
	}-*/;

}
