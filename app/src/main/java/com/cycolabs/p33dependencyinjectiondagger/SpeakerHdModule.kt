package com.cycolabs.p33dependencyinjectiondagger

import dagger.Module
import dagger.Provides

@Module
class SpeakerHdModule(var speakerChannels: Int) {

    @Provides
    fun providesSpeakerHd(speakerHD: SpeakerHD):Speaker{
        return SpeakerHD()
    }
}