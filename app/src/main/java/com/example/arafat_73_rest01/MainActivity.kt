package com.example.arafat_73_rest01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adding a splash screen delay of 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            // Start ProductActivity after the delay
            startActivity(Intent(this@MainActivity, ProductActivity::class.java))
            finish()
        }, 3000) // 3-second delay
    }
}
