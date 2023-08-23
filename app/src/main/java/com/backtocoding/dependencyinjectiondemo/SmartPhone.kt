package com.backtocoding.dependencyinjectiondemo

import android.util.Log

class SmartPhone(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {
    val TAG = "MYTAG"
    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i(TAG, "SmartPhone Constructed")
    }

    fun makeACallWithRecording() {
        Log.i(TAG, "Calling...")
    }
}