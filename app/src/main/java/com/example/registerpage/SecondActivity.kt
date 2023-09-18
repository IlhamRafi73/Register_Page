package com.example.registerpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registerpage.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(MainActivity.uname)
        val email = intent.getStringExtra(MainActivity.email)
        val phone = intent.getStringExtra(MainActivity.phone)

        with(binding){
            ambilUname.text = name
            ambilEmail.text = email
            ambilPhone.text = phone
        }
    }
}