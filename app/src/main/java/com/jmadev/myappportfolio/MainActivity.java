package com.jmadev.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressWarnings("unused") // ButtonOnClick is used in styles.xml
    public void ButtonOnClick(View v) {
        switch (v.getId()) {
            case R.id.btn_spotify:
                Toast.makeText(getApplicationContext(),"This button will launch my Spotify App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores:
                Toast.makeText(getApplicationContext(),"This button will launch my Scores App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library:
                Toast.makeText(getApplicationContext(),"This button will launch my Library App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build:
                Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_bacon:
                Toast.makeText(getApplicationContext(),"This button will launch my Bacon Reader App!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone App!",Toast.LENGTH_SHORT).show();
                break;
        }
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
