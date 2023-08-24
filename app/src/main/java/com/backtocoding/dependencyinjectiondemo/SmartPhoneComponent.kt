package com.backtocoding.dependencyinjectiondemo

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone(): SmartPhone
}