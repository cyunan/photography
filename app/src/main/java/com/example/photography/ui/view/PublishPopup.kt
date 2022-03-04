package com.example.photography.ui.view

import android.content.Context
import com.example.p_mine.databinding.FragmentMineBinding
import com.example.photography.R
import com.example.photography.databinding.BottomPublishBinding
import com.lxj.xpopup.animator.PopupAnimator
import com.lxj.xpopup.core.BottomPopupView

/**
 * Author by CYN, Date on 2022/3/3
 * 发布信息底部弹窗
 */
class PublishPopup(context: Context) : BottomPopupView(context) {
    private var binding: BottomPublishBinding? = null
    override fun getImplLayoutId(): Int = R.layout.bottom_publish

    override fun onCreate() {
        super.onCreate()
        binding = BottomPublishBinding.bind(popupImplView)
        initListener()
    }

    private fun initListener() {
        binding?.ivDismiss?.setOnClickListener { dismiss() }
    }

    // 设置最大宽度，看需要而定，
    override fun getMaxWidth(): Int {
        return super.getMaxWidth()
    }

    // 设置最大高度，看需要而定
    override fun getMaxHeight(): Int {
        return super.getMaxHeight()
    }

    // 设置自定义动画器，看需要而定
    override fun getPopupAnimator(): PopupAnimator? {
        return super.getPopupAnimator()
    }

    /**
     * 弹窗的宽度，用来动态设定当前弹窗的宽度，受getMaxWidth()限制
     *
     * @return
     */
    override fun getPopupWidth(): Int {
        return 0
    }

    /**
     * 弹窗的高度，用来动态设定当前弹窗的高度，受getMaxHeight()限制
     *
     * @return
     */
    override fun getPopupHeight(): Int {
        return 0
    }
}