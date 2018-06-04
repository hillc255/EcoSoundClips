package com.example.android.ecosoundclips;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_list);


        // Create a list of words
        ArrayList<Sound> sounds = new ArrayList<Sound>();
        sounds.add(new Sound("Loud_earthquake", "2 sec", "0.19 Mb", "freesoundeffects.com"));
        sounds.add(new Sound("Milder_earthquake", "4 sec", "0.84 Mb", "freesoundeffects.com"));
        sounds.add(new Sound("TreeCrashing_earthquake", "6 sec", "0.53 Mb", "freesoundeffects.com"));
//        words.add(new Word("daughter", "tune"));
//        words.add(new Word("older brother", "taachi"));
//        words.add(new Word("younger brother", "chalitti"));
//        words.add(new Word("older sister", "teṭe"));
//        words.add(new Word("younger sister", "kolliti"));
//        words.add(new Word("grandmother ", "ama"));
//        words.add(new Word("grandfather", "paapa"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SoundAdapter adapter = new SoundAdapter(this, sounds);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // sound_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }

}
