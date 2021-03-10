package com.example.animatedsplashscreenwithcoroutine

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
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

        lifecycleScope.launch {
            delay(3000)
            //do some work
            //loading bar or fancy animations updates...

            val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}