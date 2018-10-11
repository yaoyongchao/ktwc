package com.yyc.baselib.mvp

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

abstract class AbsJSONUtil<T> {
    val t: T
        @Throws(InstantiationException::class, IllegalAccessException::class)
        get() {
            val sType = javaClass.genericSuperclass
            val generics = (sType as ParameterizedType).actualTypeArguments
            val mTClass = generics[0] as Class<T>
            return mTClass.newInstance()
        }
}