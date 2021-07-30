package com.sample.gual

import retrofit2.Call
import retrofit2.http.*

data class ResponseDTO(var result:String? = null)

interface RetrofitService{


    @GET("/")
    fun getRequest() : Call<ResponseDTO>
    //post
    @FormUrlEncoded
    @POST("/test")
    fun postRequest(@Field("uname") uid: String,
                    @Field("email") email: String): Call<ResponseDTO>

    //post2
    @POST("/{path}")
    fun testRequest(@Path("path")path:String, @Body parameters: HashMap<String, String>): Call<ResponseDTO>
}