package org.gwtopenmaps.openlayers.client.geometry;

import org.gwtopenmaps.openlayers.client.util.JSObject;
import org.gwtopenmaps.openlayers.client.Projection;

/**
 * ...
 *
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class Point extends Geometry {

    protected Point(JSObject point){
        super(point);
    }

    /**
     *
     * @param x - double
     * @param y - double
     */
    public Point(double x, double y) {
        super(PointImpl.create(x,y));
    }

    public static Point narrowToPoint(JSObject point){
        return (point == null)?null: new Point(point);
    }

    public double getX(){
        return PointImpl.getX(getJSObject());
    }

    public double getY(){
        return PointImpl.getY(getJSObject());
    }

    public String getId(){
        return PointImpl.getId(getJSObject());
    }

    public void move(double x, double y){
        PointImpl.move(getJSObject(), x, y);
    }

    public void transform(Projection source, Projection dest){
        PointImpl.transform(getJSObject(), source.getJSObject(), dest.getJSObject());
    }

    public void setX(double x){
        PointImpl.setX(getJSObject(), x);
    }

    public void setY(double y){
        PointImpl.setY(getJSObject(), y);
    }

    public double[] getXY(){
        double[] xy = {this.getX(), this.getY()};
        return xy;
    }

    public void setXY(double x, double y){
        this.setX(x);
        this.setY(y);
    }
}
