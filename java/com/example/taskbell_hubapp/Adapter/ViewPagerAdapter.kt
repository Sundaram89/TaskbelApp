package com.example.taskbell_hubapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskbell_hubapp.R
import com.example.taskbell_hubapp.model.ItemClassModel

class ViewPagerAdapter(private val  imgList: List<ItemClassModel>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageview: ImageView =itemView.findViewById(R.id.ivImage)
        val textview:TextView=itemView.findViewById(R.id.txt1)
        val textview1:TextView=itemView.findViewById(R.id.txt2)
        val textview2:TextView=itemView.findViewById(R.id.txt3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.ViewHolder, position: Int) {
        val images=imgList[position]
        holder.imageview.setImageResource(images.image)
        holder.textview.text=images.text1
        holder.textview1.text=images.text2
        holder.textview2.text=images.text3

    }

    override fun getItemCount(): Int {
        return imgList.size
    }
}