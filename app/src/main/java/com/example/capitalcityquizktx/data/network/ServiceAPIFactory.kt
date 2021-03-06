package com.example.capitalcityquizktx.data.network

import com.example.capitalcityquizktx.data.network.register.UserManagementService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceAPIFactory {
    private const val API_BASE_URL = "http://10.0.2.2:8080/"

    fun createService(): UserManagementService {
        val logging = HttpLoggingInterceptor()
        logging.apply { logging.level = HttpLoggingInterceptor.Level.BODY }
        val httpClient = OkHttpClient.Builder().addInterceptor(logging)

        val builder = Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())

        return builder
            .client(httpClient.build())
            .build().create(UserManagementService::class.java)
    }
}
