package org.gwtopenmaps.openlayers.client.popup;

import org.gwtopenmaps.openlayers.client.popup.Popup.CloseListener;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 *
 * @author Erdem Gunay
 * @author Curtis Jensen
 * @author <a href="mailto:marten.karlberg@digpro.se">Marten Karlberg</a>, Digpro AB
 *
 */
class PopupImpl {

    public static native JSObject create(String id, JSObject lonlat, JSObject size, String html, boolean closeBox, CloseListener closeBoxCallback) /*-{
	function callback(evt) {
	    closeBoxCallback.@org.gwtopenmaps.openlayers.client.popup.Popup.CloseListener::onPopupClose(Lorg/gwtopenmaps/openlayers/client/util/JSObject;)(evt);
	}
	
	return new $wnd.OpenLayers.Popup(id, lonlat, size, html, closeBox, callback);
    }-*/;
    
    public static native JSObject create(String id, JSObject lonlat, JSObject size, String html, boolean closeBox) /*-{
	return new $wnd.OpenLayers.Popup(id, lonlat, size, html, closeBox);
    }-*/;

    public static native void addCloseListener(JSObject popup, CloseListener callback) /*-{
	function closebox(evt) {
	    callback.@org.gwtopenmaps.openlayers.client.popup.Popup.CloseListener::onPopupClose(Lorg/gwtopenmaps/openlayers/client/util/JSObject;)(evt);
	}
	    
	    popup.addCloseBox(closebox);
    }-*/;
}
