package com.example.mvpimpl.presenter

import com.example.mvpimpl.interfaces.PInterface
import com.example.mvpimpl.model.MainActivityModel

class MainActivityPresenter(view: PInterface.DataView): PInterface.Presenter {
    private var view:PInterface.DataView = view
    private var model: PInterface.DataModel = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateView()
    }

    override fun getCounter(): String {
        return model.getCounterValue().toString()
    }
}