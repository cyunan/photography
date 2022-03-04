package com.example.photography

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.alibaba.android.arouter.launcher.ARouter
import com.example.modelmain.RouterConstance
import com.example.p_mine.MineFragment

/**
 * Author by CYN, Date on 2022/3/3
 */
class MainPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = MainActivity.TAG_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            MainActivity.HOME_TAG -> ARouter.getInstance().build(RouterConstance.HomeFragment).navigation() as Fragment
            MainActivity.COM_TAG -> ARouter.getInstance().build(RouterConstance.CommunityFragment).navigation() as Fragment
            MainActivity.MEG_TAG -> ARouter.getInstance().build(RouterConstance.MessageFragment).navigation() as Fragment
            else -> ARouter.getInstance().build(RouterConstance.MineFragment).navigation() as Fragment
        }
    }

}