package com.example.photography

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.modelmain.BaseActivity
import com.example.modelmain.RouterConstance
import com.example.photography.databinding.ActivityMainBinding
import com.example.photography.ui.view.PublishPopup
import com.lxj.xpopup.XPopup
import com.lxj.xpopup.enums.PopupAnimation


@Route(path = RouterConstance.MainActivity)
class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var adapter: MainPagerAdapter

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)
    private val viewModel by viewModels<MainViewModel>{
        object : ViewModelProvider.Factory{
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel() as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewPager()
        initCheckListener()
        initListener()

    }

    private fun initListener() {
        binding.ivPublish.setOnClickListener {
            XPopup.Builder(this)
                .popupAnimation(PopupAnimation.TranslateAlphaFromBottom) //设置动画
                .dismissOnTouchOutside(true) // 点击外面消失
                .asCustom(PublishPopup(this))
                .show()

        }
    }

    private fun initCheckListener() {
        binding.rgMain.setOnCheckedChangeListener { _, checkedId ->
            if (viewModel.currentTag.value != checkedId) {
                when (checkedId) {
                    R.id.rbHome -> {
                        viewModel.currentTag.postValue(HOME_TAG)
                    }
                    R.id.rbCommunity -> {
                        viewModel.currentTag.postValue(COM_TAG)
                    }
                    R.id.rbMessage -> {
                        viewModel.currentTag.postValue(MEG_TAG)
                    }
                    R.id.rbMine -> {
                        viewModel.currentTag.postValue(MINE_TAG)
                    }
                }
            }
        }
        viewModel.currentTag.observe(this){ tag ->
            binding.mainViewPager.setCurrentItem(tag, false)
        }
        binding.rgMain.check(R.id.rbHome)
    }

    //初始化主页面
    private fun initViewPager() {
        adapter = MainPagerAdapter(this)
        binding.mainViewPager.offscreenPageLimit = adapter.itemCount - 1
        binding.mainViewPager.isUserInputEnabled = false
        binding.mainViewPager.isSaveEnabled = false
        binding.mainViewPager.adapter = adapter
    }

    companion object{
        const val HOME_TAG = 0
        const val COM_TAG = 1
        const val MEG_TAG = 2
        const val MINE_TAG = 3
        const val TAG_COUNT = 4
    }

}