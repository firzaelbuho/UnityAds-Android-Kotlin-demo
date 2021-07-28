package com.firzaaditya.testunityads

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.firzaaditya.testunityads.Unity.UnityAdsListener
import com.unity3d.ads.UnityAds

@Suppress("DEPRECATION")
class RewardAd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reward_ad)

        initializeAds()


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

    fun DisplayRewardedVideoAd() {
        val adUnitId = "Rewarded_Android"
        if (UnityAds.isReady(adUnitId)) {
            UnityAds.show(this, adUnitId)
        }
    }
}