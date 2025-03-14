package com.cycolabs.p33dependencyinjectiondagger

import dagger.Module
import dagger.Provides

@Module
class ThirdPartyModule {
    @Provides
    fun providesThirdParty(): ThirdPartyClass{
        return ThirdPartyClass()
    }
}