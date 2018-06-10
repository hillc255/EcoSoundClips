package com.example.android.ecosoundclips;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * ImageAdapter class provides arraylist of 8 images inflated
 * Derived from: https://stackoverflow.com/questions/15261088/gridview-with-two-columns-and-auto-resized-images
 */
public final class ImageAdapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    /**
     * ImageAdapter inflates arraylist for the GridView
     * @param context arraylist of items for context
     */
    public ImageAdapter(Context context) {
        mInflater = LayoutInflater.from(context);

        mItems.add(new Item("Earthquake", R.drawable.earthquake));
        mItems.add(new Item("Fire", R.drawable.fire));
        mItems.add(new Item("Forest", R.drawable.forest));
        mItems.add(new Item("Jungle", R.drawable.jungle));
        mItems.add(new Item("Ocean", R.drawable.ocean));
        mItems.add(new Item("Rain", R.drawable.rain));
        mItems.add(new Item("Thunder", R.drawable.thunder));
        mItems.add(new Item("Wind", R.drawable.wind));
    }

    /**
     * getCount is the number of items in the arraylist
     * @return number of items
     */
    @Override
    public int getCount() {
        return mItems.size();
    }

    /**
     * getItem retrieves the name item in the arraylist
     * @param i row number
     * @return item name associated with row number
     */
    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    /**
     * getItemId retrieves the image in the arraylist row
     * @param i row number
     * @return item image associated with the row number
     */
    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }

    /**
     * getView returns View of having text and image
     * @param i  row number
     * @param view  view
     * @param viewGroup  inflated view
     * @return View with both text and images
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    /**
     * Item returns name and image in a row
     */
    private static class Item {
        public final String name;
        private final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}