package org.gwtopenmaps.openlayers.client.strategy;

import org.gwtopenmaps.openlayers.client.filter.Filter;
import org.gwtopenmaps.openlayers.client.util.JSObject;

public class FilterStrategy extends Strategy {

	public FilterStrategy(JSObject strategy) {
		super(strategy);
	}

	public FilterStrategy(Filter filter) {
		this(FilterStrategyImpl.create(filter.getJSObject()));
	}

	public void setFilter(Filter filter) {
		getJSObject().setProperty("filter", filter.getJSObject());
	}

}

