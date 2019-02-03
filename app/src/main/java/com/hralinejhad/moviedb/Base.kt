package com.hralinejhad.moviedb

import android.app.Application

class Base : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: Base? = null

        fun applicationContext() : Base {
            return instance as Base
        }
    }

    override fun onCreate() {
        super.onCreate()
    }
}

