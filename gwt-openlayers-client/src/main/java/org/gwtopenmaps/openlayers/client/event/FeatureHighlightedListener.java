package org.gwtopenmaps.openlayers.client.event;

import org.gwtopenmaps.openlayers.client.feature.VectorFeature;

/**
 * Listener to handle the event FeatureHighlighted that occurs on a
 * VectorFeature of the layer
 * 
 * @author Rafael Ceravolo - LOGANN Special Solutions
 */
public interface FeatureHighlightedListener extends EventListener {

    /**
     * Called when the event FeatureHighlighted occurs on a VectorFeature of the
     * layer
     * 
     * @param vectorFeature
     *            The VectorFeature that generated the event
     */
    public void onFeatureHighlighted(VectorFeature vectorFeature);
}
