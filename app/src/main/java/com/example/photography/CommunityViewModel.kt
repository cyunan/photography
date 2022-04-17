package com.example.photography

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Author by CYN, Date on 2022/3/4
 */
class CommunityViewModel : ViewModel(){
    val currentTag = MutableLiveData<Int>(0)
}