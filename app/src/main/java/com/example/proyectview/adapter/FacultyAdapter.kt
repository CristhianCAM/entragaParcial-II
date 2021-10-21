package com.example.proyectview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectview.R
import com.example.proyectview.activity.DetalleFaculty
import com.example.proyectview.model.Faculty

class FacultyAdapter(var list: ArrayList<Faculty>, var context: Context): RecyclerView.Adapter<FacultyAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_faculty,parent,false)
        return viewHolder(v)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bindFaculty( list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var name_Faculty:TextView = itemView.findViewById(R.id.name_faculty)
        var status_faculty:TextView = itemView.findViewById(R.id.status_faculty)

        init {
            itemView.setOnClickListener(this)
        }
        fun bindFaculty(faculty: Faculty) {
            name_Faculty.text = faculty.name
            status_faculty.text = faculty.state
        }

        override fun onClick(v: View?) {
            val i = Intent(context, DetalleFaculty::class.java)
            i.putExtra("item_f", list[adapterPosition])
            context.startActivity(i)
        }
    }
}