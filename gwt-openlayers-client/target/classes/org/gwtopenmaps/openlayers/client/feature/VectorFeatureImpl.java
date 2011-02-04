package org.gwtopenmaps.openlayers.client.feature;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * @author Edwin Commandeur - Atlis EJS
 * @author Rafael Ceravolo - LOGANN
 */
public class VectorFeatureImpl {

	public native static JSObject create(JSObject geometry)/*-{
		return new $wnd.OpenLayers.Feature.Vector(geometry, null, null);
	}-*/;

	public native static JSObject create(JSObject geometry, JSObject style)/*-{
		return new $wnd.OpenLayers.Feature.Vector(geometry, null, style);
	}-*/;

}
