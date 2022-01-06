package com.example.jastpin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val judul = intent.getStringExtra("title");
        val subjudul = intent.getStringExtra("subtitle");
        val harga = intent.getStringExtra("harga");
        val gambar = intent.getStringExtra("gambar");
        val desc = intent.getStringExtra("desc")

        val tvTitle : TextView = findViewById(R.id.tv_title)
        val tvSubtitle : TextView = findViewById(R.id.tv_subtitle)
        val tvHarga : TextView = findViewById(R.id.tv_harga)
        val img : ImageView = findViewById(R.id.img_detail)
        val tvDesc : TextView = findViewById(R.id.tv_content)
        val imgCart : ImageView = findViewById(R.id.img_cart)

        tvTitle.setText(judul.toString())
        tvSubtitle.setText(subjudul.toString())
        tvHarga.setText(harga.toString())
        tvDesc.setText(desc.toString())

        Glide.with(this)
            .load(gambar)
            .apply(RequestOptions().override(55,55))
            .into(img)

        imgCart.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java).apply {
                putExtra("title", judul)
                putExtra("gambar", gambar)
            }
            startActivity(intent)
        }
    }
}