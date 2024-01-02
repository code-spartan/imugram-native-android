package com.example.libimgur.apis

import com.example.libimgur.models.GalleryResponse
import com.example.libimgur.models.TagsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ImgurAPIv3 {

    @GET("/gallery/hot?album_previews=true") // TODO: use path params
    fun getGallery() : Call<GalleryResponse>

    @GET("tags") // TODO: use path params
    fun getTags() : Call<TagsResponse>
}