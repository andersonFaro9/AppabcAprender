package com.kot.faro.myapplication

import InterfacesPortugues.Players
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*


open class MenuActivity : AppCompatActivity(),  Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        letsGoGrape()
        //toMute()
        toChangeButtonVolume()
        //toAudioMuteButtonsLettersOk()
    }







    open fun toChangeButtonVolume() {


        volume_play_menu.setOnClickListener({


            v -> v.isSelected = !v.isSelected


            if (v.isSelected)  {
                v.setBackgroundResource(R.drawable.volume_ligado)
            }
            else {
                v.setBackgroundResource(R.drawable.volume_mudo)
            }


            val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
            val ed = prefs.edit()

            ed.putBoolean("key", v.isSelected)

            ed.commit()
        })


    }


    open fun toAudioMuteButtonsLettersOk() {

        if (volume_play_menu.isSelected) stopSoundInbutton() else playSoundInButton()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@MenuActivity, GrapeActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.letras_animais -> {

                //to create method for call activity
                return true
            }

            R.id.matematica_animais -> {

                //to create method for call activity
                return true
            }


            else -> return super.onOptionsItemSelected(item)
        }

    }



    fun letsGoGrape () {

        letras.setOnClickListener {

            val intent = Intent(this@MenuActivity, GrapeActivity::class.java)
            startActivity (intent)


        }


    }





}





