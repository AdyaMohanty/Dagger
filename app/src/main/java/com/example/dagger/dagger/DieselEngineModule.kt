package com.example.dagger.dagger

import com.example.dagger.car.DieselEngine
import com.example.dagger.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {

    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}