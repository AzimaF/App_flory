package com.example.florys_app.ui.splashscreeen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.florys_app.MainActivity
import com.example.florys_app.R

class SplashScreenActity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen) // Make sure this matches your layout file name

        // Duration of the splash screen display (in milliseconds)
        val splashScreenDuration = 3000L

        // Handler to start the main activity after the splash screen duration
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Finish the splash screen activity
            finish()
        }, splashScreenDuration)
    }
}