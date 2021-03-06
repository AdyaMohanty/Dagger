package com.example.dagger.dagger

import com.example.dagger.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [WheelModule::class, DieselEngineModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}