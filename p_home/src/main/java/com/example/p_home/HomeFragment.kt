package com.example.p_home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.modelmain.BaseFragment
import com.example.modelmain.RouterConstance
import com.example.p_home.databinding.FragmentHomeBinding

@Route(path = RouterConstance.HomeFragment)
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onLazyLoad() {
        super.onLazyLoad()
    }


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)


}