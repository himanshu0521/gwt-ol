package org.gwtopenmaps.openlayers.client.util;



/**
 *
 *
 */
public class JIntArray extends JArrayBase
{
	protected JIntArray(JSObject element)
	{
		super(element);
	}

	public static JIntArray narrowToJIntArray(JSObject element)
	{
		return (element == null)?null: new JIntArray(element);
	}

	public JIntArray(int[] array)
	{
		super(array.length);

		for(int i = 0; i < array.length; i++)
		{
			set(i, array[i]);
		}
	}

	public void set(int index, int value)
	{
		JIntArrayImpl.arraySet(getJSObject(), index, value);
	}

	public int[] toArray()
	{
		int[] rtn = new int[length()];

		for(int i = 0; i < rtn.length; i++)
		{
			rtn[i] = JIntArrayImpl.getAsInt(getJSObject(), i);
		}

		return rtn;
	}

	public static JIntArray create(int[] integers){
		JIntArray array = JIntArray.narrowToJIntArray(JSObject.createJSArray());
		for(int i=0, max = integers.length; i < max;i++){
			array.push(integers[i]);
		}
		return array;
	}

	public void push(int i){
		JIntArrayImpl.push(getJSObject(), i);
	}
}
