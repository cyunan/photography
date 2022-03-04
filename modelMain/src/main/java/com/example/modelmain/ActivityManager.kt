package com.example.modelmain

import android.app.Activity
import java.util.*


/**
 * Author by CYN, Date on 2022/3/2
 */
object ActivityManager {
    //提供栈的对象
    private val activityStack = Stack<Activity>()

    //activity的添加
    fun add(activity: Activity) {
        activityStack.add(activity)
    }

    //删除指定的activity
    fun remove(activity: Activity) {
        for (i in activityStack.indices.reversed()) {
            val currentActivity = activityStack[i]
            if (currentActivity.javaClass == activity.javaClass) {
                currentActivity.finish() //销毁当前的activity
                activityStack.removeAt(i) //从栈空间移除
            }
        }
    }

    //删除当前的activity（堆栈中最后一个压入的）
    fun removeCurrent() {
        val activity = activityStack.lastElement()
        activity.finish()
        activityStack.remove(activity)
    }

    //删除所有的activity
    fun removeAll() {
        for (i in activityStack.indices.reversed()) {
            val activity = activityStack[i]
            activity.finish()
            activityStack.remove(activity)
        }
    }

    //返回栈大小
    fun size(): Int {
        return activityStack.size
    }
}