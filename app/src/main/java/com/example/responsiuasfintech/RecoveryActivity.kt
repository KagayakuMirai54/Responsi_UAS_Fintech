package com.example.responsiuasfintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class RecoveryActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var btnback : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)
        btnback = findViewById(R.id.btn_back)
        btnback.setOnClickListener(this)


    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back -> {
                val intent = Intent(this@RecoveryActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
