package com.kot.faro.myapplication

import InterfacesPortugues.ButtonsForMathBear
import InterfacesPortugues.Players
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_math_bear.*

class MathBearActivity : AppCompatActivity(), ButtonsForMathBear, Players{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_bear)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        goNumberTwo()

        goNumberFour()

        toChangeButtonVolume()
        stopSoundInbutton()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@MathBearActivity, GrapeActivity::class.java)

                startActivity(intent)
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


    override fun goNumberTwo() {

        abc_aprender_urso_2.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.check)

            toAudioMuteButtonsLettersOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()
            //TODO mudar botão de avançar pra esta tela, já que ele é diferente dos outros

            val buttonAvancar = findViewById(R.id.abc_botao_avancar_urso_math) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, ZebraActivity::class.java)
                startActivity(intent)


            })

        })
    }

    override fun goNumberFour() {

        abc_aprender_urso_4.setOnClickListener({

            toMute()


        })

    }

    override fun toMute() {

        if (volume_play_urso_math.isSelected) playSoundError() else stopSoundInbutton()

    }




    override fun toAudioMuteButtonsLettersOk() {

        if (volume_play_urso_math.isSelected) {
            playSoundInButton()

        } else {


            stopSoundInbutton()
        }
    }


    override fun toChangeButtonVolume() {

        volume_play_urso_math.setOnClickListener({

            v ->
            v.isSelected = !v.isSelected

            if (v.isSelected) {

                v.setBackgroundResource(R.drawable.volume_ligado)

                Log.d("Abc Aprender", "Teste 1")


            } else {

                v.setBackgroundResource(R.drawable.volume_mudo)

                Log.d("Abc Aprender", "Teste 2")
            }
        })

    }



}
