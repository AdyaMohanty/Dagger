package com.example.dagger

import android.app.Application
import com.example.dagger.dagger.AppComponent
import com.example.dagger.dagger.DaggerAppComponent

class CustomApplication: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}