package com.example.photography

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Author by CYN, Date on 2022/3/3
 */
class MainViewModel : ViewModel(){
    val currentTag = MutableLiveData<Int>(0)
}