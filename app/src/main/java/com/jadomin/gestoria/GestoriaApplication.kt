package com.jadomin.gestoria

import android.app.Application

class GestoriaApplication:Application() {

    companion object{
        lateinit var prefs:Prefs
    }
    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}