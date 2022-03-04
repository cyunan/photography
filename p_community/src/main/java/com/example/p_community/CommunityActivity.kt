package com.example.p_community

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.modelmain.BaseActivity
import com.example.modelmain.RouterConstance
import com.example.p_community.databinding.ActivityCommunityBinding

@Route(path = RouterConstance.CommunityActivity)
class CommunityActivity : BaseActivity<ActivityCommunityBinding>() {
    override fun getViewBinding(): ActivityCommunityBinding = ActivityCommunityBinding.inflate(layoutInflater)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            supportFragmentManager.beginTransaction()
                .add(R.id.flCommunity, CommunityFragment())
                .commit()
        }

}