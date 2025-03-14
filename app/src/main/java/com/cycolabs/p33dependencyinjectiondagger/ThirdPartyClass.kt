package com.cycolabs.p33dependencyinjectiondagger

import android.util.Log

class ThirdPartyClass{
    init {
        Log.i("TAGY","ThirdParty Class Created")
    }

    fun displayNote(){
        Log.i("TAGY","ThirdParty is running")
    }
}