package com.example.mvpimpl.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpimpl.databinding.ActivityMainBinding
import com.example.mvpimpl.interfaces.PInterface
import com.example.mvpimpl.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), PInterface.DataView {
    private lateinit var binding: ActivityMainBinding
    private var presenter:MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        binding.result.text = presenter?.getCounter()
        binding.btn.setOnClickListener{presenter?.incrementValue()}
    }

    override fun updateView() {
        binding.result.text = presenter?.getCounter()
    }
}