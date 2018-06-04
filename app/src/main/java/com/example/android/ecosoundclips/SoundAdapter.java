package com.example.android.ecosoundclips;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SoundAdapter extends ArrayAdapter<Sound> {

    private static final String LOG_TAG = SoundAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param sounds          A List of sound objects to display in a list
     */
    public SoundAdapter(Activity context, ArrayList<Sound> sounds) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, sounds);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            //       return super.getView(position, convertView, parent);
        }

        // Get the {@link Word} object located at this position in the list
        Sound currentSound = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        titleTextView.setText(currentSound.getTitleSoundClip());

        // Find the TextView in the list_item.xml layout with the ID lengthsize
        TextView lengthTextView = (TextView) listItemView.findViewById(R.id.lengthsize);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        lengthTextView.setText(currentSound.getLengthSoundClip());

        // Find the TextView in the list_item.xml layout with the ID source
        TextView sourceTextView = (TextView) listItemView.findViewById(R.id.source);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        sourceTextView.setText(currentSound.getSourceSoundClip());


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

