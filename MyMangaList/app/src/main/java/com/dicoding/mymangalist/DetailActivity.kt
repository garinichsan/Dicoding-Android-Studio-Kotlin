package com.dicoding.mymangalist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Manga Detail"

        val title = intent.getStringExtra(EXTRA_TITLE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val cover = intent.getIntExtra(EXTRA_IMAGE,0)

        val tvTitle : TextView = findViewById(R.id.manga_title)
        val tvDetail : TextView = findViewById(R.id.manga_detail)
        val tvCover : ImageView = findViewById(R.id.cover_photo)

        tvTitle.text = title
        tvDetail.text = detail
        Glide.with(this).load(cover).apply(RequestOptions().override(160, 140)).into(tvCover)

    }
}