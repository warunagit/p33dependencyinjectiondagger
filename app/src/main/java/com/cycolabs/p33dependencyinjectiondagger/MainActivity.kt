package com.cycolabs.p32dependencyinjectionapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cycolabs.p33dependencyinjectiondagger.R

class MainActivity : AppCompatActivity() {

    //1-add dagger dependencies
    //2-add anotations to all classes
    //3-create interface and add anotation to generate instances: MobleComponent

    private lateinit var mobile:Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val mobile = Mobile(
            Battery(),
            SimCard(ServiceProvider()),
            Display())
        mobile.turnOnMobile()*/
    }
}