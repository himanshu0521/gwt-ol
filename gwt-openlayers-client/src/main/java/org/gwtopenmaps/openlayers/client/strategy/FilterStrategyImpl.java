package org.gwtopenmaps.openlayers.client.strategy;

import org.gwtopenmaps.openlayers.client.util.JSObject;

public class FilterStrategyImpl {

	public native static JSObject create(JSObject options)/*-{
		return new $wnd.OpenLayers.Strategy.Filter({filter:options});
	}-*/;
}

