package com.kot.faro.myapplication

import InterfacesPortugues.ButtonsForAnimais
import InterfacesPortugues.Players
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_elefante.*

class ElefanteActivity : AppCompatActivity(), ButtonsForAnimais, Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elefante)

        goNumberOne()
        goNumberTwo()
        goNumberTree()
        toChangeButtonVolume()
        stopSoundInbutton()
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)


    }

    override fun goNumberTree( ) {

        abc_aprender_number_3.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.check)

            toAudioMuteButtonsLettersOk()

            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setMessage("Parabéns por ter completado as etapas de português, deseja voltar ao menu inicial ou praticar um pouco de matemática?!!")
                    .setCancelable(false)
                    .setPositiveButton("Sim", DialogInterface.OnClickListener{
                        dialog, which -> val intent = Intent(this, MathBearActivity::class.java)
                        startActivity(intent)

                    }).setNegativeButton("Não", DialogInterface.OnClickListener {
                dialog, which -> val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)

            })

            val alertWindow = alertBuilder.create()
            alertWindow.setTitle("Oba, você é demais!")
            alertWindow.show()

        })
    }


    override fun goNumberOne() {

        abc_aprender_number_1.setOnClickListener({

            toMute()


        })

    }

    override fun goNumberTwo() {

        abc_aprender_number_2.setOnClickListener({

            toMute()

        })
    }


    override fun toMute() {

        if (volume_play_elefant.isSelected)

            stopSoundInbutton()

        else
            playSoundError()


    }



    override fun toChangeButtonVolume() {

        volume_play_elefant.setOnClickListener({

            v -> v.isSelected = !v.isSelected

            if (v.isSelected) v.setBackgroundResource(R.drawable.volume_mudo) else v.setBackgroundResource(R.drawable.volume_ligado)

        })


    }


    override fun toAudioMuteButtonsLettersOk() {

        if (volume_play_elefant.isSelected) stopSoundInbutton()  else playSoundInButton()

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@ElefanteActivity, GrapeActivity::class.java)

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
