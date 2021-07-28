@file:Suppress("DEPRECATION")

package com.firzaaditya.testunityads

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.firzaaditya.testunityads.Unity.UnityAdsListener
import com.firzaaditya.testunityads.Unity.UnityBannerListener
import com.unity3d.ads.IUnityAdsListener
import com.unity3d.ads.UnityAds
import com.unity3d.services.banners.BannerView
import com.unity3d.services.banners.UnityBannerSize


class BannerAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner_ad)

        initializeAds()
        showBanner()
    }

    fun showBanner(){

        val bannerListener = UnityBannerListener()

        val adUnitId = "Banner_Android"

        val layout = findViewById<LinearLayout>(R.id.banner_container)
        val banner = BannerView(this, adUnitId, UnityBannerSize(320, 50))
        banner.listener = bannerListener
        banner.load()
        layout.addView(banner)


    }

    fun initializeAds(){

        val unityGameID = "4231371"
        val testMode = true


        val myAdsListener = UnityAdsListener()
        // Add the listener to the SDK:
        UnityAds.addListener(myAdsListener)
        // Initialize the SDK:
        UnityAds.initialize(this, unityGameID, testMode)

    }



}

