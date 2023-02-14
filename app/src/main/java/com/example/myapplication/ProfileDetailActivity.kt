package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInFlateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)
        //Catch Profile in MainActivity
        val profile:Profile = intent.getParcelableExtra("profile")!!
        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)

        nameTextView.setText("name : ${profile?.name}")
        ageTextView.setText("age : ${profile?.age}")

    }
}