package com.example.proyectview.services

import com.example.proyectview.model.Faculty
import com.example.proyectview.model.Programs

object InicializacionData {

    var listFaculty:ArrayList<Faculty> = ArrayList()
    var listPrograms: ArrayList<Programs> = ArrayList()

    init {

        listPrograms.add(Programs("Ingenieria en Software"))
        listPrograms.add(Programs("Ingenieria en Mecatronica"))
        listPrograms.add(Programs("Ingenieria en Industrial"))

        listFaculty.add(Faculty("Ingenieria", "Habilitado"))
        listFaculty.add(Faculty("Ciencias Administrativas y Financieras", "Habilitado"))
        listFaculty.add(Faculty("Publicidad diseño y comuicacion", "Habilitado"))
    }

    fun addFaculty(faculty: Faculty) {
        listFaculty.add(faculty)
    }

    fun addProgramsFaculty(faculty: Faculty, programs: Programs) {
        faculty.programs.add(programs)
    }

    fun editFaculty(faculty: Faculty) {
        for ((i,e) in listFaculty.withIndex()) {
            if (e.name == faculty.name) {
                listFaculty[i] = faculty
                break
            }
        }
    }
}