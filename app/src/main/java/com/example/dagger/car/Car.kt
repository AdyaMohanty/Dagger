package com.example.dagger.car

import android.util.Log
import com.example.dagger.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(val engine: Engine, wheels: Wheels, private val driver: Driver) {

    fun drive() {
        Log.d("Adya", "car instance $this driver instance $driver")
        engine.start()
        Log.d("Adya", "Driving....")
    }

    @Inject
    fun setRemote(remote: Remote) {
        remote.setListener(this)
    }
}