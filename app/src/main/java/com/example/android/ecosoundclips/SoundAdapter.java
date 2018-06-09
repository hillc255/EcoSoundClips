package com.example.android.ecosoundclips;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SoundAdapter extends ArrayAdapter<Sound> {

    private static final String LOG_TAG = SoundAdapter.class.getSimpleName();
    private MediaPlayer mp;
    private Sound currentSound;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param sounds  A List of sound objects to display in a list
     */
    public SoundAdapter(Activity context, ArrayList<Sound> sounds) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageGridView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, sounds);
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            Log.d("DEBUG", "check position inside = " + position);

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.playbutton);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Sound currentSound = getItem(position);
                    String name = currentSound.getSoundClip();

                    // create context Object for  to Fetch image from resourse
                    Context mContext = getContext();

                    // assign location of sound file
                    int i = mContext.getResources().getIdentifier(name, "raw", mContext.getPackageName());

                    //create new MediaPlayer every time playbutton is selected
                    MediaPlayer mp = new MediaPlayer();
                    mp = MediaPlayer.create(getContext(), i);
                    if (mp.isPlaying()) {
                        mp.pause();
                        mp.seekTo(0);
                        mp.reset();
                    } else {
                        mp.start();
                    }
                }
            });

        }


        // Get the {@link Sound} object located at this position in the list
        Sound currentSound = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        titleTextView.setText(currentSound.getTitleSoundClip());

        // Find the TextView in the list_item.xml layout with the ID lengthsize
        TextView lengthTextView = (TextView) listItemView.findViewById(R.id.length);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        lengthTextView.setText(currentSound.getLengthSoundClip());

        // Find the TextView in the list_item.xml layout with the ID source
        TextView sizeTextView = (TextView) listItemView.findViewById(R.id.size);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        sizeTextView.setText(currentSound.getSizeSoundClip());

        //public int getSoundClip(){ return mSoundClip;
        TextView soundTextView = (TextView) listItemView.findViewById(R.id.sound);
        soundTextView.setText(currentSound.getSoundClip());

        // Return the whole list item layout (containing 4 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}