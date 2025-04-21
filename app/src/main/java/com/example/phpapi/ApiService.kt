package com.example.phpapi

import com.example.phpapi.model.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("get_users.php")
    fun getUsers(): Call<List<User>>
}

