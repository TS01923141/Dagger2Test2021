package com.example.dagger2test

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CookingModule {
    @Singleton @Provides fun provideEgg() = Egg()
}