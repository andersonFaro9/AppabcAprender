package com.kot.faro.myapplication

import InterfacesPortugues.Players
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_uva.*

open class GrapeActivity : MenuActivity(),  Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uva)

        goFirstLetter()
        goSecondLetter()
        goThirdLetter()
        //toMute()
        //toChangeButtonVolume()
        stopSoundInbutton()

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@GrapeActivity, GrapeActivity::class.java)

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

    fun goFirstLetter( ) {

        abc_aprender_a.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.check)

            val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
            val keys = prefs.getBoolean("chave", true)

            if(keys){
                playSoundInButton()
            }


            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, PearActivity::class.java)
                startActivity(intent)

            })

        })
    }



    fun goSecondLetter() {

        abc_aprender_e.setOnClickListener({

            toMute()


        })

    }

    fun goThirdLetter() {

        abc_aprender_i.setOnClickListener({

            toMute()

        })
    }







}












