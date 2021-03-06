package com.firzaaditya.testunityads.Unity

import android.os.Debug
import android.util.Log
import com.unity3d.ads.IUnityAdsListener
import com.unity3d.ads.UnityAds.FinishState
import com.unity3d.ads.UnityAds.UnityAdsError


internal class UnityAdsListener : IUnityAdsListener {
    override fun onUnityAdsReady(adUnitId: String) {
        // Implement functionality for an ad being ready to show.
        Log.d("SDK Unity Ads Ready", "Yess")
    }

    override fun onUnityAdsStart(adUnitId: String) {
        // Implement functionality for a user starting to watch an ad.
    }

    override fun onUnityAdsFinish(adUnitId: String, finishState: FinishState) {
        // Implement functionality for a user finishing an ad.
    }

    override fun onUnityAdsError(error: UnityAdsError, message: String) {
        // Implement functionality for a Unity Ads service error occurring.
    }
}