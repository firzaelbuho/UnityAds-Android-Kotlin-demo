package com.firzaaditya.testunityads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBanner = findViewById<Button>(R.id.banner)
        val btnInter = findViewById<Button>(R.id.inter)
        val btnReward = findViewById<Button>(R.id.reward)

        btnInter.setOnClickListener {
            startActivity(Intent(this@MainActivity, InterstitialAd::class.java))
        }

        btnBanner.setOnClickListener {
            startActivity(Intent(this@MainActivity, BannerAd::class.java))
        }

        btnReward.setOnClickListener {
            startActivity(Intent(this@MainActivity, RewardAd::class.java))
        }


    }
}