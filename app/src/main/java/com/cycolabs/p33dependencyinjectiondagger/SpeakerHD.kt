package com.cycolabs.p33dependencyinjectiondagger

import android.util.Log
import jakarta.inject.Inject

class SpeakerHD @Inject constructor():Speaker {
    override fun startSound() {
        Log.i("TAGY","Speaker Sound")
    }
}