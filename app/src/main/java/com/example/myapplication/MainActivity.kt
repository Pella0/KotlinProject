package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ADD BUTTON
        val button = findViewById<Button>(R.id.start_new_activity_btn)
        button.setOnClickListener{
            val intent = Intent(this, NewActivity::class.java)

            //ADD ACTION
            intent.action = Intent.ACTION_VIEW
            //ADD CATEGORY
            intent.addCategory("user")
            //ADD EXTRA
            intent.putExtra("name", "value")
            intent.putExtra("age", 25)

            startActivity(intent)
        }

        //LOG
        Log.v("MainActivity", "Verbose message")
        Log.d("MainActivity", "Debug Message")
        Log.i(tag, "Info message")
        Log.w(tag, "Warning message")
        Log.e(tag, "Error message")
    }
}