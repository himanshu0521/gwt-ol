/**
 *
 */
package org.gwtopenmaps.openlayers.client.control;

import org.gwtopenmaps.openlayers.client.event.EventHandler;
import org.gwtopenmaps.openlayers.client.event.EventObject;
import org.gwtopenmaps.openlayers.client.event.EventType;
import org.gwtopenmaps.openlayers.client.event.MeasureEvent;
import org.gwtopenmaps.openlayers.client.event.MeasureListener;
import org.gwtopenmaps.openlayers.client.event.MeasurePartialListener;
import org.gwtopenmaps.openlayers.client.handler.Handler;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * @author Michel Vitor A Rodrigues - Intec
 *
 */
public class Measure extends Control {

	protected Measure(JSObject element) {
		super(element);
	}
	public static Measure narrowToMeasure(JSObject element)
	{
		return (element == null)?null:new Measure(element);
	}

	public Measure(Handler handler) {
		this(MeasureImpl.create(handler.getJSObject()));
	}

	public Measure(Handler handler, MeasureOptions options) {
		this(MeasureImpl.create(handler.getJSObject(),options.getJSObject()));
	}

	public void setPersist(boolean persist){
		MeasureImpl.setPersist(getJSObject(), persist);
	}

	public void addMeasureListener(final MeasureListener listener){
		eventListeners.addListener(this, listener, EventType.CONTROL_MEASURE, new EventHandler(){
			public void onHandle(EventObject eventObject){
				MeasureEvent e = new MeasureEvent(eventObject);
				listener.onMeasure(e);
			}
		});
	}

	public void addMeasurePartialListener(final MeasurePartialListener listener){
		eventListeners.addListener(this, listener, EventType.CONTROL_MEASURE_PARTIAL, new EventHandler(){
			public void onHandle(EventObject eventObject){
				MeasureEvent e = new MeasureEvent(eventObject);
				listener.onMeasurePartial(e);
			}
		});
	}
}
