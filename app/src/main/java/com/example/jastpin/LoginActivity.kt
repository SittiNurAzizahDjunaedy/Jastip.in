package com.example.jastpin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.jastpin.R
import com.example.jastpin.RegistActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var tvSingUp: TextView=findViewById(R.id.tv_sign_up)
        var btnSignIn: Button=findViewById(R.id.btn_sign_in_login)

        btnSignIn.setOnClickListener {
            val moveIntent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(moveIntent)
        }

        tvSingUp.setOnClickListener{
            val moveIntent = Intent(this@LoginActivity, RegistActivity::class.java)
            startActivity(moveIntent)
        }
    }
}