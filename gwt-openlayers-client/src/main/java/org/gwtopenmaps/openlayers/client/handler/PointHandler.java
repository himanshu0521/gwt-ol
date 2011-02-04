package org.gwtopenmaps.openlayers.client.handler;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 *
 *
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class PointHandler extends Handler {

	protected PointHandler(JSObject element) {
		super(element);
	}

	public PointHandler(){
		this(PointHandlerImpl.create());
	}
}
