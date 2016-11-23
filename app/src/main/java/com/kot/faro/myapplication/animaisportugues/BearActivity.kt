package com.kot.faro.myapplication

import InterfacesPortugues.ButtonsForAnimais
import InterfacesPortugues.Players
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_urso.*

open class BearActivity : AppCompatActivity() , ButtonsForAnimais, Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_urso)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        goNumberOne()
        goNumberTwo()
        goNumberTree()
        toChangeButtonVolume()
        stopSoundInbutton()


    }

    //TODO - > Problemas com o metodo  goNumberTwo( )


    override fun goNumberTwo( ) {

        abc_aprender_number_2.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.check)

            toAudioMuteButtonsLettersOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_portugues_animais) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, ZebraActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            })

        })
    }


    override fun goNumberOne() {

        abc_aprender_number_1.setOnClickListener({

            toMute()


        })

    }

    override fun goNumberTree() {

        abc_aprender_number_3.setOnClickListener({

            toMute()

        })
    }


    override fun toMute() {

        if (volume_play_urso.isSelected)

            stopSoundInbutton()

        else
            playSoundError()


    }



    override fun toChangeButtonVolume() {

        volume_play_urso.setOnClickListener({

            v -> v.isSelected = !v.isSelected

            if (v.isSelected) v.setBackgroundResource(R.drawable.volume_mudo) else v.setBackgroundResource(R.drawable.volume_ligado)

        })


    }


    override fun toAudioMuteButtonsLettersOk() {

        if (volume_play_urso.isSelected) stopSoundInbutton()  else playSoundInButton()

    }








    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@BearActivity, GrapeActivity::class.java)

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



}
