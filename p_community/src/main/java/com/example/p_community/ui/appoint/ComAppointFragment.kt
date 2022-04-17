package com.example.p_community.ui.appoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.modelmain.BaseFragment
import com.example.p_community.databinding.FragmentComAppointBinding
import com.example.p_community.databinding.FragmentComHomeBinding

//社区约拍
class ComAppointFragment : BaseFragment<FragmentComAppointBinding>() {


    override fun onLazyLoad() {
        super.onLazyLoad()
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentComAppointBinding = FragmentComAppointBinding.inflate(layoutInflater)


}