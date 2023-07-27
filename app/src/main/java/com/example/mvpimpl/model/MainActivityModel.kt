package com.example.mvpimpl.model

import com.example.mvpimpl.interfaces.PInterface

class MainActivityModel: PInterface.DataModel{
    private var counter = 0
    override fun incrementCounter() {
        counter++
    }

    override fun getCounterValue(): Int {
        return counter
    }
}