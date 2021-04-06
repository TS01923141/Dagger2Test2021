package com.example.dagger2test

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CookingModule::class])
interface CookingComponent {
    fun inject(activity: MainActivity)
}