package com.cycolabs.p33dependencyinjectiondagger

import dagger.Module
import dagger.Provides

@Module
class SpeakerHdModule {

    @Provides
    fun providesSpeakerHd(speakerHD: SpeakerHD):Speaker{
        return SpeakerHD()
    }
}