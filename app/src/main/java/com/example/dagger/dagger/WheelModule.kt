package com.example.dagger.dagger

import com.example.dagger.car.Rim
import com.example.dagger.car.Tire
import com.example.dagger.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun provideTire(): Tire {
        val tire = Tire()
        tire.inflate()
        return tire
    }

    @Provides
    fun provideRim(): Rim {
        return Rim()
    }

    @Provides
    fun provideWheels(tire: Tire, rim: Rim): Wheels {
        return Wheels(tire, rim)
    }
}