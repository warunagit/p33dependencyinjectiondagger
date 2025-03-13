package com.cycolabs.p32dependencyinjectionapp

import android.util.Log
import javax.inject.Inject

class Display @Inject constructor(){
    init {
        Log.i("TAGY","Screen Created")

    }

    fun turnOnScreen(){
        Log.i("TAGY","Turning on the screen")
    }
}