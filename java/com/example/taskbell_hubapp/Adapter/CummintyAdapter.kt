package com.example.taskbell_hubapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskbell_hubapp.R
import com.example.taskbell_hubapp.model.CumminityModel

class CummintyAdapter (private val mlist: List<CumminityModel>) :
    RecyclerView.Adapter<CummintyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cumminty, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nearest_resturant = mlist[position]
        holder.resturant_logo.setImageResource(nearest_resturant.image)
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val resturant_logo: ImageView = itemView.findViewById(R.id.user1)


    }
}