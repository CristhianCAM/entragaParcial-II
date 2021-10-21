package com.example.proyectview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectview.databinding.ActivityDeatalleFacultyBinding
import com.example.proyectview.model.Faculty

class DetalleFaculty : AppCompatActivity() {

    lateinit var binding: ActivityDeatalleFacultyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeatalleFacultyBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val faculty = intent.getParcelableExtra<Faculty>("item_f")

        if (faculty != null ) {
            binding.infoFaculty.text = faculty.toString()
        }
    }


}