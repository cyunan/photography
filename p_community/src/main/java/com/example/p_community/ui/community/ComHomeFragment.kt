package com.example.p_community.ui.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.modelmain.BaseFragment
import com.example.p_community.databinding.FragmentComHomeBinding

//社区首页
class ComHomeFragment : BaseFragment<FragmentComHomeBinding>() {


    override fun onLazyLoad() {
        super.onLazyLoad()
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentComHomeBinding = FragmentComHomeBinding.inflate(layoutInflater)


}