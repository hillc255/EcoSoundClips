package com.example.android.ecosoundclips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * MainActivity class displays 8 images in GridView created with ImageAdapter and ImageGrid
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get images from GridView and set them to the new ImageAdapter
        GridView gridView = findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));
        //GridView listener for each image clicked
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            /**
             * Pass corresponding AdapterView parameters for each GridView image clicked
             * @param parent ImageAdapter to create the images in the grid
             * @param v View within the AdapterView
             * @param position position of item within the Adapter data set
             * @param id row id associated with the position
             */
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Create a new intent to open the {@link SoundActivity}
                Intent soundIntent = new Intent(MainActivity.this, SoundActivity.class);
                //Pass variable relating to grid number position to SoundActivity
                soundIntent.putExtra("gridNumber", position);
                // Start the new activity
                startActivity(soundIntent);
            }
        });

    }

}