package com.example.responsiuasfintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class   LoginActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var hereRecovery: TextView
    private lateinit var hereRegister: TextView
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.btn_Login)
        btnLogin.setOnClickListener(this)
        hereRecovery = findViewById(R.id.here_recovery)
        hereRecovery.setOnClickListener(this)
        hereRegister = findViewById(R.id.here_register)
        hereRegister.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_Login -> {
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
            }
            R.id.here_register -> {
                val intent = Intent(this@LoginActivity, RecoveryActivity::class.java)
                startActivity(intent)
            }
            R.id.here_recovery -> {
                val intentRecovery = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intentRecovery)


            }
        }
    }

}