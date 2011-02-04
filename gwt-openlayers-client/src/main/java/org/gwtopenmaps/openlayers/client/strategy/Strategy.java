package org.gwtopenmaps.openlayers.client.strategy;

import org.gwtopenmaps.openlayers.client.OpenLayersObjectWrapper;
import org.gwtopenmaps.openlayers.client.layer.Layer;
import org.gwtopenmaps.openlayers.client.util.JSObject;

public abstract class Strategy extends OpenLayersObjectWrapper{

	protected Strategy(JSObject strategy) {
		super(strategy);
	}
	
	public void setLayer(Layer layer) {
		getJSObject().setProperty("layer", layer.getJSObject());
	}

}
