package com.kot.faro.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by faro on 29/10/16.
 */

class Teste extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    public void show () {
        MediaPlayer mp;
        mp = new MediaPlayer();
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        //LinearLayout myLayout = (LinearLayout)findViewById(R.id.linearLayout2);
        //View hiddenInfo = getLayoutInflater().inflate(R.layout.hidden, myLayout, false);
        //myLayout.addView(hiddenInfo);
    }


}
