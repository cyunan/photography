package com.example.p_mine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.modelmain.BaseFragment
import com.example.modelmain.RouterConstance
import com.example.p_mine.databinding.FragmentMineBinding

@Route(path = RouterConstance.MineFragment)
class MineFragment : BaseFragment<FragmentMineBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMineBinding = FragmentMineBinding.inflate(layoutInflater)


}