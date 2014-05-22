package com.mousebird.maply;

import android.graphics.Typeface;

/**
 * We use this class to designate attribute shared by a group of labels.
 * Rather than specifying them individually they all go here.  You would
 * use this class in the course of an addLabels() or addScreenLabels()
 * call on the MaplyController.
 * 
 * @author sjg
 *
 */
public class LabelInfo 
{
	public LabelInfo()
	{
		initialise();
		setTextColor(1.f,1.f,1.f,1.f);
		setBackgroundColor(0.f,0.f,0.f,0.f);
	}
	
	public void finalize()
	{
		dispose();
	}
	
	/**
	 * Controls whether or not the geometry will be visible.  By
	 * default this is true.
	 * @param newEnable New value for the enable.
	 */
	public native void setEnable(boolean enable);

	public native void setDrawOffset(float drawOffset);
	public native void setDrawPriority(int drawPriority);
	public native void setMinVis(float minVis);
	public native void setMaxVis(float maxVis);
	public native void setTextColor(float r,float g,float b,float a);
	public native void setBackgroundColor(float r,float g,float b,float a);
	public native void setTypeface(Typeface typeface);
	
//	public native Typeface getTypeface();
//	public native void getTextColor(Float r,Float g,Float b);
//	public native void getBackColor(Float r,Float g,Float b);

	/**
	 * The amount of time (in seconds) it takes for new geometry
	 * to fade in and fade out.  By default, fade is off.
	 * 
	 * @param newFade The new fade value.
	 */
	public native void setFade(float fade);
	
	static
	{
		nativeInit();
	}
	private static native void nativeInit();
	native void initialise();
	native void dispose();
	private long nativeHandle;

}
