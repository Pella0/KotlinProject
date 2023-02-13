package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewActivity : AppCompatActivity() {
    val tag = "NewActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)

        //definir mon action
        var action = intent.action

        //category
        val isUserview = intent.hasCategory("user")

        //charge mes extra in bundle
        val extra: Bundle? = intent.extras
        val name = extra?.getString("name")
        val age = extra?.getInt("age")

        Log.i(tag, "action: $action, isUserViewer: $isUserview, name: $name, age: $age")

    }
}