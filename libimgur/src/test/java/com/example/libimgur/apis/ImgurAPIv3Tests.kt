package com.example.libimgur.apis

import okhttp3.OkHttpClient
import org.junit.Assert.assertNotNull
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ImgurAPIv3Tests {

    private val client = OkHttpClient.Builder().addInterceptor{
        val request = it.request().newBuilder().addHeader("Authorization","Client-ID 1f871bff2181525").build()
        it.proceed(request)
    }.build()

    private val retrofit = Retrofit.Builder().client(client).addConverterFactory(MoshiConverterFactory.create()).baseUrl("https://api.imgur.com/3/").build()
    private val api = retrofit.create(ImgurAPIv3::class.java)

    @Test
    fun `get tags working`() {

        val response = api.getTags().execute()
        assertNotNull(response.body())
    }

    fun `get galleries working`() {

        val response = api.getTags().execute()
        assertNotNull(response.body())
    }

}