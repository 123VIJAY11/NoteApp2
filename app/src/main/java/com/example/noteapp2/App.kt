package com.example.noteapp2

import android.app.Application
import com.example.noteapp2.utils.Helper

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Helper.unit(this)
    }
}