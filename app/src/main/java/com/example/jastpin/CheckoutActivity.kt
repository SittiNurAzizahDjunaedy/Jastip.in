package com.example.jastpin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val judul = intent.getStringExtra("title");
        val gambar = intent.getStringExtra("gambar");

        val tvTitle : TextView = findViewById(R.id.tv_check)
        val img : ImageView = findViewById(R.id.gambar_check)

        tvTitle.setText(judul.toString())
        Glide.with(this)
            .load(gambar)
            .apply(RequestOptions().override(55,55))
            .into(img)

    }
}