/**
 * 
 */
package org.gwtopenmaps.openlayers.client.filter;

import org.gwtopenmaps.openlayers.client.util.JSObject;

public class ComparisonFilter extends Filter {

	public static final String EQUAL_TO = "==";
	public static final String NOT_EQUAL_TO = "!=";
	public static final String LESS_THAN = "<";
	public static final String GREATER_THAN = ">";
	public static final String LESS_THAN_OR_EQUAL_TO = "<=";
	public static final String GREATER_THAN_OR_EQUAL_TO = ">=";
	public static final String BETWEEN = "..";
	public static final String LIKE = "~";

	protected ComparisonFilter(JSObject filter) {
		super(filter);
	}

	public ComparisonFilter() {
		this(ComparisonFilterImpl.create());
	}

	public void setType(String type) {
		getJSObject().setProperty("type", type);
	}

	public void setProperty(String property) {
		getJSObject().setProperty("property", property);
	}

	public void setValue(String value) {
		getJSObject().setProperty("value", value);
	}

	public void setLowerBoundary(String lowerBoundary) {
		getJSObject().setProperty("lowerBoundary", lowerBoundary);
	}

	public void setUpperBoundary(String upperBoundary) {
		getJSObject().setProperty("upperBoundary", upperBoundary);
	}

}
