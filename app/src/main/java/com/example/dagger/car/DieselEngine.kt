package com.example.dagger.car

import android.util.Log
import javax.inject.Inject

class DieselEngine constructor(val horsepower: Int): Engine {

    override fun start() {
        Log.d("Adya", "Starting engine with HP $horsepower")
        Log.d("Adya", "Starting diesel engine....")
    }
}