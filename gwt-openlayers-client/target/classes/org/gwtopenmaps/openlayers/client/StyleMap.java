package org.gwtopenmaps.openlayers.client;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 *
 * StyleMap contais a set of tree styles
 * <ul>
 * <li>default : the default style to render the feature </li>
 * <li>select : the style to render the feature when it is selected </li>
 * <li> temporary: style to render the feature when it is temporarily selected </li>
 * </ul>
 *
 * @author Rafael Ceravolo - LOGANN
 */
public class StyleMap extends OpenLayersObjectWrapper {

	protected StyleMap(JSObject openLayersObject) {
	super(openLayersObject);
	}

	/**
	 * Creates a StyleMap with default properties
	 */
	public StyleMap() {
	this(StyleMapImpl.create());
	}

	/**
	 * Creates a StyleMap setting the same style for all renderer intents.
	 * <p>
	 * From OpenLayers documentation: If just one style hash or style object is
	 * passed, this will be used for all known render intents (default, select,
	 * temporary)
	 */
	public StyleMap(Style style) {
	this(StyleMapImpl.create(style.getJSObject(), style.getJSObject(),
		style.getJSObject()));
	}

	/**
	 * Creates a StyleMap setting different styles for renderer intents.
	 * <p>
	 * Avoid passing null for one of the styles. If just want to use 2 style,
	 * pass the same style for selectStyle and tempraryStyle parameters.
	 *
	 * @param defaultStyle
	 *            the default style to render the feature
	 * @param selectStyle
	 *            the style to render the feature when it is selected
	 * @param temporaryStyle
	 *            style to render the feature when it is temporarily selected
	 */
	public StyleMap(Style defaultStyle, Style selectStyle, Style temporaryStyle) {
	this(StyleMapImpl.create(
		defaultStyle == null ? null : defaultStyle.getJSObject(),
		selectStyle == null ? null : selectStyle.getJSObject(),
		temporaryStyle == null ? null : temporaryStyle.getJSObject()));
	}

}
