package com.example.dagger.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower") val horsePower: Int,
                                       @Named("engineCapacity") val engineCapacity: Int): Engine {

    override fun start() {
        Log.d("Adya", "Starting petrol engine with $horsePower and engine capacity $engineCapacity")
    }
}