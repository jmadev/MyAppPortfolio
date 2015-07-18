package com.jmadev.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_spotify);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // show toast
            }
        });

        Button btnSpotify = (Button) findViewById(R.id.btn_spotify);
        btnSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // show toast
                Toast.makeText(getApplicationContext(),"This button will launch my Spotify Streamer App!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btnScores = (Button) findViewById(R.id.btn_scores);
        btnScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // show toast
                Toast.makeText(getApplicationContext(),"This button will launch my Scores App!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btnLibrary = (Button) findViewById(R.id.btn_library);
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // show toast
                Toast.makeText(getApplicationContext(),"This button will launch my Library App!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btnBuild = (Button) findViewById(R.id.btn_build);
        btnBuild.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // show toast
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnBacon = (Button) findViewById(R.id.btn_bacon);
        btnBacon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // show toast
                Toast.makeText(getApplicationContext(),"This button will launch my Bacon Reader App!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // show toast
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone App!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
