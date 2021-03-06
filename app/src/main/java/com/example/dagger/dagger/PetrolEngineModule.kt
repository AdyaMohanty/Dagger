package com.example.dagger.dagger

import com.example.dagger.car.Engine
import com.example.dagger.car.PetrolEngine
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class PetrolEngineModule(private val horsePower: Int, private val engineCapacity: Int) {

    @Provides
    fun provideEngine(petrolEngine: PetrolEngine): Engine {
        return petrolEngine
    }

    @Provides
    @Named("horsePower")
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    @Named("engineCapacity")
    fun provideEngineCapacity(): Int {
        return engineCapacity
    }
}