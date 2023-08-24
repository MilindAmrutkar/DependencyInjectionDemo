package com.backtocoding.dependencyinjectiondemo

import android.util.Log

class MemoryCard {
    init {
        Log.i("MYTAG", "Memory Card Constructed")
    }

    fun getSpaceAvailability() {
        Log.i("MYTAG", "Memory space available")
    }
}