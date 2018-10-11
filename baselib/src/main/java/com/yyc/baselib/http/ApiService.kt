package com.yyc.baselib.http

import com.yyc.baselib.base.User
import com.yyc.baselib.http.entity.BaseEntity
import io.reactivex.Observable
import io.reactivex.Observer
import retrofit2.http.GET

/**
 * Author: Austin
 * Date: 2018/10/9
 * Description:
 */

interface ApiService {
//    @GET("login")
//    Call<You> login();

    @GET("login1")
    fun login1(): Observable<BaseEntity<User>>
}