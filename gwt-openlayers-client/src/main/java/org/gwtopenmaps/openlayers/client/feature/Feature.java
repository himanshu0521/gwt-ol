package org.gwtopenmaps.openlayers.client.feature;

import org.gwtopenmaps.openlayers.client.Bounds;
import org.gwtopenmaps.openlayers.client.LonLat;
import org.gwtopenmaps.openlayers.client.OpenLayersObjectWrapper;
import org.gwtopenmaps.openlayers.client.Style;
import org.gwtopenmaps.openlayers.client.popup.Popup;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * 
 * @author Edwin Commandeur - Atlis EJS
 * @author Curtis Jensen
 * 
 */
public abstract class Feature extends OpenLayersObjectWrapper {

    protected Feature(JSObject element){
        super(element);
    }
    
    public void destroy(){
        FeatureImpl.destroy(getJSObject());
    }
    
    /**
     * @return a generated ID. Prefer the use of <code>getFID</code>, which supports an OGC standard.
     */
    public String getFeatureId(){
        return FeatureImpl.getFeatureId(getJSObject());
    }
    
    public String getFID(){
        return FeatureImpl.getFID(getJSObject());
    }

	public Popup createPopup(boolean closeBox) {
		JSObject popupObj = FeatureImpl.createPopup(this.getJSObject(), closeBox);
		
		return Popup.narrowToOpenLayersPopup(popupObj);
	}
	
	public LonLat getCenterLonLat() {
		return Bounds.narrowToBounds(FeatureImpl.getBounds(this.getJSObject())).getCenterLonLat();
	}
	
	public void setPopup(Popup popup) {
		FeatureImpl.setPopup(this.getJSObject(), popup.getJSObject());
	}
	
	public Popup getPopup() {
		return Popup.narrowToOpenLayersPopup(FeatureImpl.getPopup(this.getJSObject()));
	}
	
	public void resetPopup() {
		FeatureImpl.resetPopup(this.getJSObject());
	}
	
	public void setStyle(Style newStyle) {
		FeatureImpl.setStyle(this.getJSObject(), newStyle.getJSObject());
	}
}
