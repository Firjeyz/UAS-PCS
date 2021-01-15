package com.firjeyz.nokinoco.api

import com.firjeyz.nokinoco.data.model.DetailUserResponse
import com.firjeyz.nokinoco.data.model.User
import com.firjeyz.nokinoco.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 62bef704ee39879775a356f660ddc144d7b2ee26")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 62bef704ee39879775a356f660ddc144d7b2ee26")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 62bef704ee39879775a356f660ddc144d7b2ee26")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 62bef704ee39879775a356f660ddc144d7b2ee26")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}