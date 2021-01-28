package com.jessi.webview.command

/**
 * 有一个原则，为了减少中间调用时重复封装的次数， Map result 中带上回调给webview的信息
 * key: callbackname,  value: 从传递的参数params中通过 getKey("callback") 方式获取
 */
interface ResultBack {
    fun onResult(status : Int, action : String, result : Any?)
}