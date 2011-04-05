package org.gwtopenmaps.openlayers.client.geometry;

import org.gwtopenmaps.openlayers.client.util.JSObject;

public class CollectionImpl {

    public native static int getNumberOfComponents(JSObject self)/*-{
        return self.components.length;
    }-*/;
    
    public native static JSObject getComponent(JSObject self, int index)/*-{
        return self.components[index];
    }-*/;

    public native static boolean intersects(JSObject self, JSObject other)/*-{
        return self.intersects(other);
    }-*/;
}
