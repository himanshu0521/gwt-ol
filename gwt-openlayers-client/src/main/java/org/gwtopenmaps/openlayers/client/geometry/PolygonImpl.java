/**
 *
 */
package org.gwtopenmaps.openlayers.client.geometry;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class PolygonImpl {

	public static native JSObject create(JSObject rings)/*-{
		return new $wnd.OpenLayers.Geometry.Polygon($wnd.gwt_openlayers_util.convertToArray(rings));
	}-*/;

	public static native boolean intersects(JSObject self, JSObject other)/*-{
		return self.intersects(other);
}-*/;
}
