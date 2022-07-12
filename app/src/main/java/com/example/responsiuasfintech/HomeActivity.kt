package com.example.responsiuasfintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.responsiuasfintech.history.HistoryFragment
import com.example.responsiuasfintech.home.HomeFragment
import com.example.responsiuasfintech.payment.PaymentFragment
import com.example.responsiuasfintech.setting.SettingFragment


class HomeActivity : AppCompatActivity() {

    private lateinit var btnHome : Button
    private lateinit var btnPayment : Button
    private lateinit var btnHistory: Button
    private lateinit var btnSetting: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnHome = findViewById(R.id.btn_home)
        btnPayment = findViewById(R.id.btn_payment)
        btnHistory = findViewById(R.id.btn_history)
        btnSetting = findViewById(R.id.btn_setting)

        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btnPayment.setOnClickListener{
            loadFragment(PaymentFragment())
        }
        btnHistory.setOnClickListener{
            loadFragment(HistoryFragment())
        }
        btnSetting.setOnClickListener{
            loadFragment(SettingFragment())
        }

    }

    private fun loadFragment (fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}