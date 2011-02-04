package org.gwtopenmaps.openlayers.client.geometry;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class PointImpl {

    public native static JSObject create(double x, double y)/*-{
        return new $wnd.OpenLayers.Geometry.Point(x, y);
    }-*/;

    public native static double getX(JSObject self)/*-{
        return self.x;
    }-*/;

    public native static double getY(JSObject self)/*-{
        return self.y;
    }-*/;

    public native static String getId(JSObject self)/*-{
        return self.id;
    }-*/;

    public native static void move(JSObject self, double changeX, double changeY)/*-{
        self.move(changeX, changeY);
    }-*/;

    public native static void transform(JSObject self, JSObject source, JSObject dest)/*-{
        self.transform(source, dest);
    }-*/;

    public native static void setX(JSObject self, double x)/*-{
        self.x = x;
    }-*/;

    public native static void setY(JSObject self, double y)/*-{
        self.y = y;
    }-*/;

}
