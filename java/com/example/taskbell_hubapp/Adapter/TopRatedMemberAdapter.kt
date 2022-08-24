package com.example.taskbell_hubapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskbell_hubapp.R
import com.example.taskbell_hubapp.ReviewActivity
import com.example.taskbell_hubapp.model.CumminityModel
import com.example.taskbell_hubapp.model.TopRatedMemberModel

class TopRatedMemberAdapter(private val mlist1: List<TopRatedMemberModel>) :
    RecyclerView.Adapter<TopRatedMemberAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.topratedmember, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val message = mlist1[position]
        holder.memberpic.setImageResource(message.memberpic)
        holder.peoplename.text=message.peoplename
        holder.timeupdate.text=message.timeupdate
        holder.callicon.setImageResource(message.callicon)
        holder.itemView.setOnClickListener{
            val intent=Intent(it.context,ReviewActivity::class.java)
            it.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return mlist1.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val memberpic:ImageView=itemView.findViewById(R.id.member1)
        val peoplename:TextView=itemView.findViewById(R.id.peoplename)
        val timeupdate:TextView=itemView.findViewById(R.id.timeupdate)
        val callicon:ImageView=itemView.findViewById(R.id.callbutton)



    }
}

