package com.cycolabs.p33dependencyinjectiondagger

import android.app.Application
import com.cycolabs.p32dependencyinjectionapp.Mobile

class MobileApplication: Application(){
    lateinit var mobile: MobileComponent

    override fun onCreate() {
        mobile = initDagger()
        super.onCreate()
    }

    private fun initDagger(): MobileComponent = DaggerMobileComponent
        .builder()
        .speakerHdModule(SpeakerHdModule(4))
        .build()
}