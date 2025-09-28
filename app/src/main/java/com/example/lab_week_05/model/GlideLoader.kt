package com.example.lab_week_05.model
import com.example.lab_week_05.ImageLoader
import com.bumptech.glide.Glide
import android.widget.ImageView
import android.content.Context
class GlideLoader(private val context: Context) : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}