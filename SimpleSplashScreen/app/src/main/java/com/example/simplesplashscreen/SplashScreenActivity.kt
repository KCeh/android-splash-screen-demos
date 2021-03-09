package com.example.simplesplashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //routing...
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}