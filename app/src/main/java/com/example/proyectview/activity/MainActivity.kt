package com.example.proyectview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.proyectview.R
import com.example.proyectview.model.list_faculty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dirigirListFaculty(v : View) {
        startActivity(Intent(this, list_faculty::class.java))
    }
}