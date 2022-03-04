package com.example.p_community

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.modelmain.BaseFragment
import com.example.modelmain.RouterConstance
import com.example.p_community.databinding.FragmentCommunityBinding

@Route(path = RouterConstance.CommunityFragment)
class CommunityFragment : BaseFragment<FragmentCommunityBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCommunityBinding = FragmentCommunityBinding.inflate(layoutInflater)
}