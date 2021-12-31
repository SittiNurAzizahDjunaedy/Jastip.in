package com.example.jastpin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.jastpin.R
import com.example.jastpin.RegistActivity

class AwalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)

        var btnSignIn: Button = findViewById(R.id.btn_sign_in)
        var btnSignUp: Button = findViewById(R.id.btn_sign_up)

        btnSignUp.setOnClickListener {
            val moveIntent = Intent(this@AwalActivity, RegistActivity::class.java)
            startActivity(moveIntent)
        }

        btnSignIn.setOnClickListener {
            val moveIntent = Intent(this@AwalActivity, LoginActivity::class.java)
            startActivity(moveIntent)
        }
    }
}