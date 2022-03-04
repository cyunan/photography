package com.example.p_login

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.modelmain.BaseActivity
import com.example.modelmain.RouterConstance
import com.example.p_login.databinding.ActivityLoginBinding

@Route(path = RouterConstance.LoginActivity)
class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override fun getViewBinding(): ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}