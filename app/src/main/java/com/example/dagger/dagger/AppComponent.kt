package com.example.dagger.dagger

import dagger.Component
import javax.inject.Singleton

@Component(modules = [DriverModule::class])
@Singleton
interface AppComponent {
    fun getActivityComponent(dieselEngineModule: DieselEngineModule): ActivityComponent
}