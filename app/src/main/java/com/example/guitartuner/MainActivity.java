package com.example.guitartuner;

import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
//import android.widget.Toast;
import android.widget.ToggleButton;
import android.media.MediaPlayer;
import android.widget.TabHost;


//public class MainActivity extends Activity implements MediaPlayer.OnCompletionListener{
public class MainActivity extends Activity{

    ToggleButton tbtnE6;
    ToggleButton tbtnA;
    ToggleButton tbtnD;
    ToggleButton tbtnG;
    ToggleButton tbtnB;
    ToggleButton tbtnE1;

    ImageButton ibtnLoop;
    MediaPlayer mpGuitar;
    Boolean loopIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec1 = tabHost.newTabSpec("tab1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Acoustic");
        tabHost.addTab(spec1);

        TabHost.TabSpec spec2 = tabHost.newTabSpec("tab2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("Electric");
        tabHost.addTab(spec2);

        TabHost.TabSpec spec3 = tabHost.newTabSpec("tab3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("Bass");
        tabHost.addTab(spec3);


        tbtnE6 = (ToggleButton) findViewById(R.id.toggleButton1);
        tbtnA = (ToggleButton) findViewById(R.id.toggleButton2);
        tbtnD = (ToggleButton) findViewById(R.id.toggleButton3);
        tbtnG = (ToggleButton) findViewById(R.id.toggleButton4);
        tbtnB = (ToggleButton) findViewById(R.id.toggleButton5);
        tbtnE1 = (ToggleButton) findViewById(R.id.toggleButton6);

        ibtnLoop = (ImageButton) findViewById(R.id.imageButton1);

        mpGuitar = new MediaPlayer();
        mpGuitar = MediaPlayer.create(this, R.raw.stringe6);

        loopIndicator = false;

        tbtnA.setChecked(false);
        tbtnD.setChecked(false);
        tbtnG.setChecked(false);
        tbtnB.setChecked(false);
        tbtnE1.setChecked(false);
        tbtnE6.setChecked(false);

    }

//    @Override
//    public void onCompletion(MediaPlayer mp) {
//        mpGuitar = MediaPlayer.create(Servicio_Reproductor.this, MainActivity.uri);
//        mpGuitar.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//
//                // actions
//            }
//        });
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // handle action bar item presses

        switch (item.getItemId()){
            case R.id.action_exit:
                super.finish();
                return true;
            case R.id.action_settings:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onToggleE6Click (View v) {
        if (!tbtnE6.isChecked()){
            mpGuitar.stop();
        }
        else {
            mpGuitar.stop();
            mpGuitar = MediaPlayer.create(this, R.raw.stringe6);
//            mpGuitar.setLooping(loopIndicator);
            mpGuitar.setLooping(true);
            mpGuitar.start();

            tbtnA.setChecked(false);
            tbtnD.setChecked(false);
            tbtnG.setChecked(false);
            tbtnB.setChecked(false);
            tbtnE1.setChecked(false);
        }
    }

    public void onToggleAClick (View v) {
        if (!tbtnA.isChecked()){
            mpGuitar.stop();
        }
        else {
            mpGuitar.stop();
            mpGuitar = MediaPlayer.create(this, R.raw.stringa);
//            mpGuitar.setLooping(loopIndicator);
            mpGuitar.setLooping(true);
            mpGuitar.start();

            tbtnE6.setChecked(false);
            tbtnD.setChecked(false);
            tbtnG.setChecked(false);
            tbtnB.setChecked(false);
            tbtnE1.setChecked(false);
        }
    }

    public void onToggleDClick (View v) {
        if (!tbtnD.isChecked()){
            mpGuitar.stop();
        }
        else {
            mpGuitar.stop();
            mpGuitar = MediaPlayer.create(this, R.raw.stringd);
//            mpGuitar.setLooping(loopIndicator);
            mpGuitar.setLooping(true);
            mpGuitar.start();

            tbtnE6.setChecked(false);
            tbtnA.setChecked(false);
            tbtnG.setChecked(false);
            tbtnB.setChecked(false);
            tbtnE1.setChecked(false);
        }
    }

    public void onToggleGClick (View v) {
        if (!tbtnG.isChecked()){
            mpGuitar.stop();
        }
        else {
            mpGuitar.stop();
            mpGuitar = MediaPlayer.create(this, R.raw.stringg);
//            mpGuitar.setLooping(loopIndicator);
            mpGuitar.setLooping(true);
            mpGuitar.start();

            tbtnE6.setChecked(false);
            tbtnA.setChecked(false);
            tbtnD.setChecked(false);
            tbtnB.setChecked(false);
            tbtnE1.setChecked(false);
        }
    }

    public void onToggleBClick (View v) {
        if (!tbtnB.isChecked()){
            mpGuitar.stop();
        }
        else {
            mpGuitar.stop();
            mpGuitar = MediaPlayer.create(this, R.raw.stringb);
//            mpGuitar.setLooping(loopIndicator);
            mpGuitar.setLooping(true);
            mpGuitar.start();

            tbtnE6.setChecked(false);
            tbtnA.setChecked(false);
            tbtnD.setChecked(false);
            tbtnG.setChecked(false);
            tbtnE1.setChecked(false);
        }
    }

    public void onToggleE1Click (View v) {
        if (!tbtnE1.isChecked()){
            mpGuitar.stop();
        }
        else {
            mpGuitar.stop();
            mpGuitar = MediaPlayer.create(this, R.raw.stringe1);
//            mpGuitar.setLooping(loopIndicator);
            mpGuitar.setLooping(true);
            mpGuitar.start();

            tbtnE6.setChecked(false);
            tbtnA.setChecked(false);
            tbtnD.setChecked(false);
            tbtnG.setChecked(false);
            tbtnB.setChecked(false);
        }
    }

    public void onButtonLoopClick(View v) {
        if (loopIndicator){
            loopIndicator = false;
            mpGuitar.stop();
            ibtnLoop.setImageResource(R.drawable.ic_loop);
            tbtnE6.setChecked(false);
            tbtnA.setChecked(false);
            tbtnD.setChecked(false);
            tbtnG.setChecked(false);
            tbtnB.setChecked(false);
            tbtnE1.setChecked(false);
        }
        else {
            loopIndicator = true;
            ibtnLoop.setImageResource(R.drawable.ic_stop);
        }
    }
}

