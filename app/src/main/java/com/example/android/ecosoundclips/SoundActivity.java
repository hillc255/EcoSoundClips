package com.example.android.ecosoundclips;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.view.View.OnClickListener;
import android.media.MediaPlayer;
import com.example.android.ecosoundclips.SoundAdapter;


public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_list);

        //Position of gridView selected passed from MainAvtivity
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("gridNumber", 0);


        // Create a list of sounds
        ArrayList<Sound> sounds = new ArrayList<Sound>();
        sounds.add(new Sound("Major earthquake", "2 seconds", "0.19 Mb"));
        sounds.add(new Sound("Moderate earthquake", "4 seconds", "0.84 Mb"));
        sounds.add(new Sound("Earthquake breaking trees", "6 seconds", "0.53 Mb"));
        sounds.add(new Sound("Crackling fireplace", "4 seconds", "0.41 Mb"));
        sounds.add(new Sound("Forest fire", "5 seconds", "0.42 Mb"));
        sounds.add(new Sound("Fire burning", "5 seconds", "0.45 Mb"));
        sounds.add(new Sound("Forest in the morning", "3 seconds", "0.66 Mb"));
        sounds.add(new Sound("Forest at night", "7 seconds", "0.59 Mb"));
        sounds.add(new Sound("Forest birds", "6 seconds", "0.53 Mb"));
        sounds.add(new Sound("Jungle Monkeys", "8 seconds", "0.80 Mb"));
        sounds.add(new Sound("Jungle Animals", "7 seconds", "0.67 Mb"));
        sounds.add(new Sound("Jungle at Night", "9 seconds", "0.85 Mb"));
        sounds.add(new Sound("Beach", "7 seconds", "0.77 Mb"));
        sounds.add(new Sound("Big wave", "3 seconds", "0.26 Mb"));
        sounds.add(new Sound("Ocean laps", "3 seconds", "0.32 Mb"));
        sounds.add(new Sound("Thunder and rain", "4 seconds", "0.48 Mb"));
        sounds.add(new Sound("Heavy rain", "4 seconds", "0.73 Mb"));
        sounds.add(new Sound("Light rain", "5 seconds", "0.50 Mb"));
        sounds.add(new Sound("Thunder", "4 seconds", "0.28 Mb"));
        sounds.add(new Sound("Thunder crack", "4 seconds", "0.44 Mb"));
        sounds.add(new Sound("Thunder rumble", "4 seconds", "0.20 Mb"));
        sounds.add(new Sound("Wind chimes", "4 seconds", "0.28 Mb"));
        sounds.add(new Sound("High winds", "4 seconds", "0.33 Mb"));
        sounds.add(new Sound("Breeze", "5 seconds", "0.42 Mb"));


        //create sublists from ArrayList for each gridView
        switch (intValue) {
            case 0:
                ArrayList<Sound> sounds0 = new ArrayList<Sound>(sounds.subList(0, 3));
                sounds = sounds0;
                break;
            case 1:
                ArrayList<Sound> sounds1 = new ArrayList<Sound>(sounds.subList(3, 6));
                sounds = sounds1;
                break;
            case 2:
                ArrayList<Sound> sounds2 = new ArrayList<Sound>(sounds.subList(6, 9));
                sounds = sounds2;
                break;
            case 3:
                ArrayList<Sound> sounds3 = new ArrayList<Sound>(sounds.subList(9, 12));
                sounds = sounds3;
                break;
            case 4:
                ArrayList<Sound> sounds4 = new ArrayList<Sound>(sounds.subList(12, 15));
                sounds = sounds4;
                break;
            case 5:
                ArrayList<Sound> sounds5 = new ArrayList<Sound>(sounds.subList(15, 18));
                sounds = sounds5;
                break;
            case 6:
                ArrayList<Sound> sounds6 = new ArrayList<Sound>(sounds.subList(18, 21));
                sounds = sounds6;
                break;
            case 7:
                ArrayList<Sound> sounds7 = new ArrayList<Sound>(sounds.subList(21, 24));
                sounds = sounds7;
                break;
        }


        // Create an {@link SoundAdapter}, whose data source is a list of {@link Sound}s. The
        // adapter knows how to create list items for each item in the list.
        SoundAdapter adapter = new SoundAdapter(this, sounds);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // sound_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sound} in the list.
        listView.setAdapter(adapter);

    }

}
