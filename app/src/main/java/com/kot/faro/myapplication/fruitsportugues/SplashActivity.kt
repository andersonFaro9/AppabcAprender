package com.kot.faro.myapplication.fruitsportugues

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Window
import com.kot.faro.myapplication.MenuActivity
import com.kot.faro.myapplication.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        loadSplash()

    }


    fun loadSplash () {

        Handler().postDelayed({

            val i = Intent(this@SplashActivity, MenuActivity::class.java)
            startActivity(i)

            // close this activity
            finish()
        }, 1000)
    }

}
