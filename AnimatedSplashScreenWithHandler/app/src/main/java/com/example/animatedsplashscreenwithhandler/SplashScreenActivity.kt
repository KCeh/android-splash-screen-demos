package com.example.animatedsplashscreenwithhandler

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed

class SplashScreenActivity : AppCompatActivity() {

    var handler = Handler() //deprecated!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val topAnimation = AnimationUtils.loadAnimation(this, R.anim.from_top)
        val bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.from_bottom)

        //in real app use view or data binding
        val logoImage = findViewById<ImageView>(R.id.splash_logo_image)
        val logoText = findViewById<ImageView>(R.id.splash_logo_text)

        logoImage.animation=topAnimation
        logoText.animation=bottomAnimation

        handler.postDelayed(3000) {
            val intent = Intent(this, MainActivity::class.java)
            //do some work
            //loading bar or fancy animations updates...
            startActivity(intent)
            finish()
        }
    }

    override fun onDestroy() {
        //handle handler removal..
        handler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }
}