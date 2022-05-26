package com.example.skindiseasedetectionapp.ui.front

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.skindiseasedetectionapp.MainActivity
import com.example.skindiseasedetectionapp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            finish()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        },2500)
    }

}