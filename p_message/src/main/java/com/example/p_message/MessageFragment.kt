package com.example.p_message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.modelmain.BaseFragment
import com.example.modelmain.RouterConstance
import com.example.p_message.databinding.FragmentMessageBinding

@Route(path = RouterConstance.MessageFragment)
class MessageFragment : BaseFragment<FragmentMessageBinding>() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMessageBinding = FragmentMessageBinding.inflate(layoutInflater)

}