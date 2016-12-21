package com.kot.faro.myapplication

import Interfacesforportugues.ButtonsForFruits
import Interfacesforportugues.Players

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import com.kot.faro.myapplication.animaismath.MathTwoBearActivity
import com.kot.faro.myapplication.fruitsmath.MathOrangeFourActivity
import kotlinx.android.synthetic.main.activity_maca.*

class AppleActivity : AppCompatActivity(),ButtonsForFruits,  Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maca)

        goFirstLetter()
        goSecondLetter()
        goThirdLetter()

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
    }




     override fun goSecondLetter() {

        abc_aprender_m.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)


            toGetKeyForLetterOk()



            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, PortuguesBearActivity::class.java)
                startActivity(intent)

            })

        })
    }


    override fun toGetKeyForLetterOk() {

        val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
        val keys = prefs.getBoolean("chave", true)

        if(keys){

            playSoundInButton()
        }
    }

    override fun toGetKeyForLetterError() {
        val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
        val keys = prefs.getBoolean("chave", true)

        if(keys){
            playSoundError()
        }
    }




    override fun goFirstLetter( ) {

        abc_aprender_b.setOnClickListener({

            toGetKeyForLetterError()


        })

    }


    override fun goThirdLetter() {

        abc_aprender_n.setOnClickListener({
            toGetKeyForLetterError()

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

                startActivity(intent)
                return true
            }

            R.id.menu_inicial -> {

                val intent = Intent(this@AppleActivity, MenuActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.letras_animais -> {

                val intent = Intent(this@AppleActivity, PortuguesBearActivity::class.java)

                startActivity(intent)
                return true
            }
            R.id.sobre -> {

                val intent = Intent(this@AppleActivity, SobreActivity::class.java)

                startActivity (intent)
                return true
            }


            R.id.dev -> {

                val intent = Intent(this@AppleActivity, DevsActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.matematica_animais -> {

                val intent = Intent(this@AppleActivity, MathTwoBearActivity::class.java)

                startActivity(intent)
                return true
            }


            R.id.matematica_frutas -> {

                val intent = Intent(this@AppleActivity, MathOrangeFourActivity::class.java)

                startActivity(intent)
                return true
            }


            else -> return super.onOptionsItemSelected(item)
        }

    }







}
