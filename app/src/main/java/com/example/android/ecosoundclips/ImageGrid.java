package com.example.android.ecosoundclips;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;


/**
 * ImageGrid class provides images in grid format with text on landing page
 * Derived from: https://stackoverflow.com/questions/15261088/gridview-with-two-columns-and-auto-resized-images
 */
public class ImageGrid extends AppCompatImageView {
    /**
     * ImageGrid initializes the parent class for the grid
     *
     * @param context parent class
     */
    public ImageGrid(Context context) {
        super(context);
    }

    /**
     * ImageGrid passes attribute sets for the grid
     *
     * @param context parent class
     * @param attrs   attributes
     */
    public ImageGrid(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * ImageGrid passes styles for the grid
     *
     * @param context  parent class
     * @param attrs    attributes
     * @param defStyle style
     */
    public ImageGrid(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * onMeasure displays the expandable size of the images in the GridView
     *
     * @param widthMeasureSpec  width of the images
     * @param heightMeasureSpec height of the images
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}