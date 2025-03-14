package com.cycolabs.p32dependencyinjectionapp

import android.util.Log
import com.cycolabs.p33dependencyinjectiondagger.Speaker
import com.cycolabs.p33dependencyinjectiondagger.ThirdPartyClass
import javax.inject.Inject

class Mobile @Inject constructor(val battery: Battery, val simCard: SimCard, val display: Display, val thirdParty: ThirdPartyClass, val speaker: Speaker) {

    init {
        battery.displayBatteryPower()
        simCard.connectToNetwork()
        display.turnOnScreen()
        thirdParty.displayNote()
        speaker.startSound()

        Log.i("TAGY","Mobile is created successfully")
    }

    fun turnOnMobile(){
        Log.i("TAGY","Mobile is turned on")
    }
}