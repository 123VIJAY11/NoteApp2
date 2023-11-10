package com.example.noteapp2.utils

import android.content.Context
import android.content.SharedPreferences

object Helper {

    private lateinit var sharedPreferences: SharedPreferences

    fun unit(context: Context) {
        sharedPreferences = context.getSharedPreferences("onBoard", Context.MODE_PRIVATE)
    }

    var isOnBoardShown: Boolean
        get() = sharedPreferences.getBoolean("board", false)
        set(value) = sharedPreferences.edit().putBoolean("board", value).apply()

    var isSignUp: Boolean
        get() = sharedPreferences.getBoolean("key", false)
        set(value) = sharedPreferences.edit().putBoolean("key", value).apply()
}
