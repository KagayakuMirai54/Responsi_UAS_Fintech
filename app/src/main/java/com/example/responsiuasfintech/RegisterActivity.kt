package com.example.responsiuasfintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class RegisterActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var backlogin : ImageView
    private lateinit var reghome : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        backlogin = findViewById(R.id.iv_backrgstr)
        backlogin.setOnClickListener(this)
        reghome = findViewById(R.id.btn_register)
        reghome.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_backrgstr -> {
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
        when (v.id) {
            R.id.btn_register -> {
                val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}