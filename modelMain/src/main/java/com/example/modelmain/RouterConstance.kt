package com.example.modelmain

/**
 * Author by CYN, Date on 2022/2/3
 * ARouter统一管理路径标签
 */
object RouterConstance {
    const val MainActivity = "/photography/app/LoginActivity"
    const val LoginActivity = "/p_login/LoginActivity"
    const val CommunityActivity = "/p_community/CommunityActivity"

    /**
     * 首页相关页面统跳
     */
    const val HomeFragment = "/p_home/HomeFragment"

    /**
     * 社区页相关页面统跳
     */
    const val CommunityFragment = "/p_community/CommunityFragment"


    /**
     * 消息页相关页面统跳
     */
    const val MessageFragment = "/p_message/MessageFragment"

    /**
     * 个人页相关页面统跳
     */
    const val MineFragment = "/p_mine/MineFragment"

}