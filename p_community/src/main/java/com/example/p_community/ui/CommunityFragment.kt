package com.example.p_community.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.modelmain.BaseFragment
import com.example.modelmain.RouterConstance
import com.example.p_community.CommunityPagerAdapter
import com.example.p_community.databinding.FragmentCommunityBinding
import com.google.android.material.tabs.TabLayoutMediator


@Route(path = RouterConstance.CommunityFragment)
class CommunityFragment : BaseFragment<FragmentCommunityBinding>() {
    private lateinit var adapter: CommunityPagerAdapter

    override fun onLazyLoad() {
        super.onLazyLoad()
        initViewPager()
        initCheckListener()
    }



    //初始化社区页
    private fun initViewPager() {
        adapter = CommunityPagerAdapter(this)
        binding.vpContent.adapter = adapter
    }

    private fun initCheckListener() {
        val tab = TabLayoutMediator(binding.tbTitle, binding.vpContent){ Tab, position->
            when(position){
                0 -> Tab.text = "社区"
                1 -> Tab.text = "约拍"
            }
        }
        tab.attach()
    }


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCommunityBinding = FragmentCommunityBinding.inflate(layoutInflater)

    companion object{
        const val CommunityTag = 0//社区首页
        const val AppointTag = 1//约拍约拍
        const val TAG_COUNT = 2
    }
}