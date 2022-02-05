package com.example.modelmain

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Author by CYN, Date on 2022/2/3
 */
open class BaseApplication : Application(){
    //ARouter调试开关
    private var isDebugARouter = true
    override fun onCreate() {
        super.onCreate()
        if (isDebugARouter){
            //下面两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog()//打印日志
            //开启调试模式
            ARouter.openDebug()
        }
        ARouter.init(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        ARouter.getInstance().destroy()
    }
}