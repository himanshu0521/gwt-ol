package org.gwtopenmaps.openlayers.client.layer;

import org.gwtopenmaps.openlayers.client.OpenLayersEObjectWrapper;
import org.gwtopenmaps.openlayers.client.event.EventHandler;
import org.gwtopenmaps.openlayers.client.event.EventObject;
import org.gwtopenmaps.openlayers.client.event.EventType;
import org.gwtopenmaps.openlayers.client.event.LayerLoadCancelListener;
import org.gwtopenmaps.openlayers.client.event.LayerLoadEndListener;
import org.gwtopenmaps.openlayers.client.event.LayerLoadStartListener;
import org.gwtopenmaps.openlayers.client.event.LayerVisibilityChangedListener;
import org.gwtopenmaps.openlayers.client.event.LayerLoadCancelListener.LoadCancelEvent;
import org.gwtopenmaps.openlayers.client.event.LayerLoadEndListener.LoadEndEvent;
import org.gwtopenmaps.openlayers.client.event.LayerLoadStartListener.LoadStartEvent;
import org.gwtopenmaps.openlayers.client.event.LayerVisibilityChangedListener.VisibilityChangedEvent;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 *
 * @author Erdem Gunay,
 *         Amr Alam - Refractions Research,
 *         Edwin Commandeur - Atlis EJS
 *
 */
public class Layer extends OpenLayersEObjectWrapper {

	public final static String ARCGIS93REST_CLASS_NAME = "OpenLayers.Layer.ArcGIS93Rest";
	public final static String BOXES_CLASS_NAME = "OpenLayers.Layer.Boxes";
	public final static String GOOGLE_CLASS_NAME = "OpenLayers.Layer.Google";
	public final static String GRIDLAYER_CLASS_NAME = "OpenLayers.Layer.Grid";
	public final static String HTTPREQUESTLAYER_CLASS_NAME = "OpenLayers.Layer.HTTPRequest";
	public final static String IMAGE_CLASS_NAME = "OpenLayers.Layer.Image";
	public final static String MARKERS_CLASS_NAME ="OpenLayers.Layer.Markers";
	public final static String OSM_CLASS_NAME = "OpenLayers.Layer.OSM";
	public final static String TMS_CLASS_NAME = "OpenLayers.Layer.TMS";
	public final static String VECTOR_CLASS_NAME = "OpenLayers.Layer.Vector";
	public final static String WMS_CLASS_NAME = "OpenLayers.Layer.WMS";
	public final static String XYZ_CLASS_NAME = "OpenLayers.Layer.XYZ";

	//TODO: add support for moveend event
	//TODO: refactor to use getJSObject().getProperty/setProperty

	protected Layer(JSObject element) {
		super(element);
	}

	public static Layer narrowToLayer(JSObject layer){
		return new Layer(layer);
	}

	public void setIsBaseLayer(boolean isBaseLayer) {
		LayerImpl.setIsBaseLayer(isBaseLayer, getJSObject());
	}

	/**
	 * Indicates if Layer is a BaseLayer.
	 *
	 * @return true if the layer is a BaseLayer
	 *         false if the layer is not a BaseLayer
	 */
	public boolean isBaseLayer() {
		return LayerImpl.isBaseLayer(getJSObject());
	}

	public String getId() {
		return LayerImpl.getId(getJSObject());
	}

	public float getOpacity(){
		return LayerImpl.getOpacity(getJSObject());
	}

	public void setOpacity(float opacity){
		LayerImpl.setOpacity(opacity, getJSObject());
	}

	/**
	 * Indicates if the Layer should be displayed in the LayerSwitcher Control.
	 *
	 * @return true if the layer should be displayed in the LayerSwitcher Control,
	 *         false if the layer should be hidden
	 */
	public boolean displayInLayerSwitcher(){
		return LayerImpl.displayInLayerSwitcher(getJSObject());
	}

	public void setDisplayInLayerSwitcher(boolean display){
		LayerImpl.setDisplayInLayerSwitcher(display, getJSObject());
	}

	/**
	 * @return The name of the Layer, or an empty string if no name was found.
	 */
	public String getName(){
		return LayerImpl.getName(getJSObject());
	}

	/**
	 * @param name - the new name for the layer.
	 */
	public void setName(String name){
		getJSObject().setProperty("name", name);
	}

	public boolean isVisible(){
		return LayerImpl.isVisible(getJSObject());
	}

	public void setIsVisible(boolean isVisible){
		LayerImpl.setIsVisible(isVisible, getJSObject());
	}

	public boolean redraw() {
		/* super class redraw doesn't have a force.  But we'll pass through a value since the JSNI expects one */
		return LayerImpl.redraw(getJSObject(), true);
	}

	public void addOptions(LayerOptions layerOptions) {
		LayerImpl.addOptions(getJSObject(), layerOptions.getJSObject());
	}


	public void addLayerLoadStartListener(final LayerLoadStartListener listener){
		eventListeners.addListener(this, listener, EventType.LAYER_LOADSTART, new EventHandler(){
			public void onHandle(EventObject eventObject) {
				LoadStartEvent e = new LoadStartEvent(eventObject);
				listener.onLoadStart(e);
			}
		 });
	}

	public void addLayerLoadEndListener(final LayerLoadEndListener listener){
		eventListeners.addListener(this, listener, EventType.LAYER_LOADEND, new EventHandler(){
			public void onHandle(EventObject eventObject) {
				LoadEndEvent e = new LoadEndEvent(eventObject);
				listener.onLoadEnd(e);
			}
		 });
	}

	public void addLayerLoadCancelListener(final LayerLoadCancelListener listener){
		eventListeners.addListener(this, listener, EventType.LAYER_LOADCANCEL, new EventHandler(){
			public void onHandle(EventObject eventObject) {
				LoadCancelEvent e = new LoadCancelEvent(eventObject);
				listener.onLoadCancel(e);
			}
		 });
	}

	public void addLayerVisibilityChangedListener(final LayerVisibilityChangedListener listener){
		eventListeners.addListener(this, listener, EventType.LAYER_VISIBILITYCHANGED, new EventHandler(){
			public void onHandle(EventObject eventObject) {
				VisibilityChangedEvent e = new VisibilityChangedEvent(eventObject);
				listener.onVisibilityChanged(e);
			}
		 });
	}

}
