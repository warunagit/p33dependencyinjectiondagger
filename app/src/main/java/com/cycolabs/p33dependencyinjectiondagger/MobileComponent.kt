package com.cycolabs.p33dependencyinjectiondagger

import com.cycolabs.p32dependencyinjectionapp.MainActivity
import com.cycolabs.p32dependencyinjectionapp.Mobile
import dagger.Component

@Component(modules = [ThirdPartyModule::class, SpeakerHdModule::class])
interface MobileComponent {
    fun getMobileInstance(): Mobile

    fun inject(mainActivity: MainActivity)
}