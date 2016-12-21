package Interfacesforportugues

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import com.kot.faro.myapplication.R

/**
 * Created by faro on 13/11/16.
 */
interface Players {

    fun AppCompatActivity.stopSoundInbutton() {
        val mediaStop = MediaPlayer.create(getApplicationContext(), R.raw.bterrado)
        mediaStop.stop()
    }

    fun AppCompatActivity.playSoundInButton() {
        val mediaPlay = MediaPlayer.create(getApplicationContext(), R.raw.btok);
        mediaPlay.start()
    }

    fun AppCompatActivity.playSoundError() {
        val mediaStop = MediaPlayer.create(getApplicationContext(), R.raw.bterrado)
        mediaStop.start()
    }
}