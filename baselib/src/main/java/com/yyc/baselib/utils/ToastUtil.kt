package com.yyc.baselib.utils

import android.widget.Toast
import com.yyc.baselib.BaseApplication

/**
 * Author: Austin
 * Date: 2018/10/9
 * Description:
 */
class ToastUtil {
    companion object {
        public fun show(msg: String) {
            Toast.makeText(BaseApplication.instance().applicationContext,msg,Toast.LENGTH_SHORT).show()
        }

        public fun showLong(msg: String) {
            Toast.makeText(BaseApplication.instance().applicationContext,msg,Toast.LENGTH_LONG).show()
        }
    }
}