package com.example.modelmain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Author by CYN, Date on 2022/2/2
 * 基类Fragment
 */
abstract class BaseFragment<T : ViewBinding> : Fragment() {
    private lateinit var _binding: T
    protected val binding get() = _binding;
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getViewBinding(inflater, container)
        ARouter.getInstance().inject(this)
        return _binding.root
    }

    protected abstract fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): T

    /** 已初始化数据标志 */
    private var isInitializedData = false

    override fun onResume() {
        super.onResume()
        if (!isInitializedData && !isHidden) {
            onLazyLoad()
            isInitializedData = true
        }
    }

    override fun onDestroy() {
        isInitializedData = false
        super.onDestroy()
    }

    open fun onLazyLoad() {

    }


}