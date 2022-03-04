package com.example.modelmain

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.alibaba.android.arouter.launcher.ARouter


/**
 * Author by CYN, Date on 2022/2/2
 * 基类Activity
 */
abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {
    private lateinit var _binding: T
    protected val binding get() = _binding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding()
        setContentView(_binding.root)
        ARouter.getInstance().inject(this)
        //将当前的activity添加到ActivityManager中
        ActivityManager.add(this)
    }
    protected abstract fun getViewBinding(): T


    inline fun <reified T> startActivity(
        context: Context,
        block: Intent.() -> Unit = {}
    ){
        val intent = Intent(context, T::class.java).also(block)
        context.startActivity(intent)
    }

    inline fun <reified T> startActivityForResult(
        context: Activity,
        requestCode: Int,
        block1: Intent.() -> Unit,
        block2: Bundle.() -> Unit
    ){
        val intent = Intent(context, T::class.java).also(block1)
        val bundle = Bundle().also(block2)
        context.startActivityForResult(intent, requestCode, bundle)
    }


    //销毁当前的Activity
    open fun removeCurrentActivity() {
        ActivityManager.removeCurrent()
    }

    //销毁所有的activity
    open fun removeAll() {
        ActivityManager.removeAll()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

