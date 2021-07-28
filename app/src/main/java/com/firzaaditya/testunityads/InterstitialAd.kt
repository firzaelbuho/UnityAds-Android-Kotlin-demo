package com.firzaaditya.testunityads

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.firzaaditya.testunityads.Unity.UnityAdsListener
import com.firzaaditya.testunityads.Unity.UnityBannerListener
import com.unity3d.ads.IUnityAdsListener
import com.unity3d.ads.IUnityAdsLoadListener
import com.unity3d.ads.UnityAds
import com.unity3d.services.banners.BannerView
import com.unity3d.services.banners.UnityBannerSize


@Suppress("DEPRECATION")
class InterstitialAd : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mai_a_bammer)

        initializeAds();
        showInter()

    }

    fun showInter(){

        val adUnitId = "Interstitial_Android";



        UnityAds.load(adUnitId, object : IUnityAdsLoadListener{
            override fun onUnityAdsAdLoaded(p0: String?) {
                Log.d("iNTERSTITIAL LOADED", "Yess sudah diload")
            }

            override fun onUnityAdsFailedToLoad(p0: String?, p1: UnityAds.UnityAdsLoadError?, p2: String?) {
                Log.d("iNTERSTITIAL LOADED", "belum , gagal diload")
            }
        })




        if (UnityAds.isReady(adUnitId)) {
            UnityAds.show (this, adUnitId);
            Log.d("iNTERSTITIAL LOADED", "Yess")
        } else {
            Log.d("iNTERSTITIAL LOADED", "${UnityAds.isReady (adUnitId)}")
        }

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