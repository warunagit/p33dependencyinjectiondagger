package com.cycolabs.p32dependencyinjectionapp

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cycolabs.p33dependencyinjectiondagger.DaggerMobileComponent
import com.cycolabs.p33dependencyinjectiondagger.R
import jakarta.inject.Inject
import jakarta.inject.Provider

class MainActivity : Activity() {

    //1-add dagger dependencies
    //2-add anotations to all classes
    //3-create interface and add anotation to generate instances: MobleComponent
    //4-create class for dagger joint dependent: MobleComponent
    //it will generate factory classes for all dependancies
    //5-For third-party classess, must create a dagger module with annotations.
    // ThirdParty, ThirdPartyModule
    // And should introduce the third party class to joint class: MobileComponent
    //6-For third-party interfaces,


    //private lateinit var mobile:Mobile

    @Inject
    lateinit var mobile:Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerMobileComponent.create().getMobileInstance().turnOnMobile()

        DaggerMobileComponent.create().inject(this)
        mobile.turnOnMobile()
    }
}