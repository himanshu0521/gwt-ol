package org.gwtopenmaps.openlayers.client.format;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * Brief explanation of Well Known Text (WKT) vector format here.
 *
 * Reference to WKT specification.
 *
 * @author Edwin Commandeur - Atlis EJS
 */
public class WKT extends VectorFormat {

	public WKT(JSObject wktFormat){
		super(create(wktFormat));
	}

	public WKT(){
		this(WKTImpl.create());
	}

        public static native JSObject create(JSObject object)/*-{
                return new $wnd.OpenLayers.Format.WKT(object);
        }-*/;
}
