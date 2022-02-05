package com.example.modelmain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

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
        return _binding.root
    }

    protected abstract fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): T
}