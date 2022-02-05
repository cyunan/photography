package com.example.photography

import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.example.modelmain.BaseActivity
import com.example.modelmain.RouterConstance
import com.example.photography.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnLogin.setOnClickListener {
            ARouter.getInstance()
                .build(RouterConstance.LoginActivity)
                .navigation()
        }
    }


}