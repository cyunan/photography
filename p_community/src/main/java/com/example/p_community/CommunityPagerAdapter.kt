package com.example.p_community

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.alibaba.android.arouter.launcher.ARouter
import com.example.modelmain.RouterConstance
import com.example.p_community.ui.CommunityFragment
import com.example.p_community.ui.appoint.ComAppointFragment
import com.example.p_community.ui.community.ComHomeFragment

/**
 * Author by CYN, Date on 2022/3/3
 * 社区页适配器
 */
class CommunityPagerAdapter(
    fragment: Fragment
) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = CommunityFragment.TAG_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            CommunityFragment.CommunityTag -> ComHomeFragment()
            CommunityFragment.AppointTag -> ComAppointFragment()
            else -> ComHomeFragment()
        }
    }

    override fun containsItem(itemId: Long): Boolean {
        return itemId in 0 until itemCount
    }

}