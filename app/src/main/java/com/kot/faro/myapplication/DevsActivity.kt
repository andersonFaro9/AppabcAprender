package com.kot.faro.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.kot.faro.myapplication.animaismath.MathTwoBearActivity
import com.kot.faro.myapplication.fruitsmath.MathOrangeFourActivity

class DevsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devs)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@DevsActivity, GrapeActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.dev -> {

                val intent = Intent(this@DevsActivity, DevsActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.menu_inicial -> {

                val intent = Intent(this@DevsActivity, MenuActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.sobre -> {

                val intent = Intent(this@DevsActivity, SobreActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.letras_animais -> {

                val intent = Intent(this@DevsActivity, PortuguesBearActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.matematica_animais -> {

                val intent = Intent(this@DevsActivity, MathTwoBearActivity::class.java)

                startActivity (intent)
                return true
            }


            R.id.matematica_frutas -> {

                val intent = Intent(this@DevsActivity, MathOrangeFourActivity::class.java)

                startActivity (intent)
                return true
            }


            else -> return super.onOptionsItemSelected(item)
        }

    }
}
