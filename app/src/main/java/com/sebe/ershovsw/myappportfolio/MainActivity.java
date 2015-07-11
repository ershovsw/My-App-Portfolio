package com.sebe.ershovsw.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void seOnClick(View v){
        String message="";

        switch (v.getId()) {
            case R.id.scores:
                message="Scores";
                break;
            case R.id.spotify:
                message="Spotify Streamer";
                break;
            case R.id.library:
                message="Library";
                break;
            case R.id.bigger:
                message="Buld It Bigger";
                break;
            case R.id.xyz:
                message="XYZ Reader";
                break;
            case R.id.castone:
                message="Capstone";
                break;
        }
        String finnal_message="This button will launch my "+message+" app!";
        Toast toast=Toast.makeText(getApplicationContext(), finnal_message,Toast.LENGTH_SHORT);
        toast.show();
    }
}
