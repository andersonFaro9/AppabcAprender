package com.kot.faro.myapplication

import InterfacesPortugues.Players
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_maca.*

class AppleActivity : AppCompatActivity(),  Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maca)
        goSecondLetter()
        //goThirdLetter()
        goFirstLetter( )
        //toChangeButtonVolume()
        stopSoundInbutton()
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
    }




     fun goSecondLetter() {

        abc_aprender_m.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.check)

            //toAudioMuteButtonsLettersOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, BearActivity::class.java)
                startActivity(intent)

            })

        })
    }

     fun goFirstLetter( ) {

        abc_aprender_b.setOnClickListener({

            //toMute()


        })

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@AppleActivity, GrapeActivity::class.java)

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
