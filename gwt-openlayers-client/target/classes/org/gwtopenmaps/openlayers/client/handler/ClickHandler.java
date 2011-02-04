package org.gwtopenmaps.openlayers.client.handler;

import org.gwtopenmaps.openlayers.client.util.JSObject;

public class ClickHandler extends Handler {
	
	protected ClickHandler(JSObject element) {
		super(element);
	}

	public ClickHandler(){
		this(ClickHandlerImpl.create());
	}
}
