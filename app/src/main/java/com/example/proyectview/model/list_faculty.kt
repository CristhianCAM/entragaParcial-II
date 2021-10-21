package com.example.proyectview.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectview.R
import com.example.proyectview.adapter.FacultyAdapter
import com.example.proyectview.databinding.ActivityListFacultyBinding
import com.example.proyectview.services.InicializacionData

class list_faculty : AppCompatActivity() {

    lateinit var binding: ActivityListFacultyBinding
    lateinit var listFaculty: ArrayList<Faculty>
    lateinit var listPrograms: ArrayList<Programs>
    lateinit var adapter:FacultyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFacultyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listPrograms = InicializacionData.listPrograms
        listFaculty = InicializacionData.listFaculty

        adapter = FacultyAdapter(listFaculty, this)
        binding.listFaculty.adapter = adapter
        binding.listFaculty.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_faculty, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.menu_agregar -> {
                val e = Faculty("Arquitectura", "Habilitado")
                val p = Programs("Diseño de modelado")
                InicializacionData.addProgramsFaculty(e,p)
                InicializacionData.addFaculty(e)
                adapter.notifyItemInserted(listFaculty.size -1)
            }
        /*  R.id.menu_eliminar -> {
                listFaculty.removeAt(0)
                adapter.notifyItemRemoved(0)
            }
*/
            R.id.menu_modificar -> {
                listFaculty[0] = Faculty("Ingenieria", "Deshabilitado")
                adapter.notifyItemChanged(0)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}