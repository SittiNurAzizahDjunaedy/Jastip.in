package com.example.jastpin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgCemilan: ImageView = findViewById(R.id.img_cemilan)

        imgCemilan.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, CemilanActivity::class.java)
            startActivity(moveIntent)
        }
    }
}