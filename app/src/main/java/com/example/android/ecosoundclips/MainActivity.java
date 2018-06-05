package com.example.android.ecosoundclips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Create a new intent to open the {@link SoundActivity}
                Intent soundIntent = new Intent(MainActivity.this, SoundActivity.class);
                //pass variable relating to grid number position
                soundIntent.putExtra("gridNumber",position);
                // Start the new activity
                startActivity(soundIntent);
            }
        });

    }

}