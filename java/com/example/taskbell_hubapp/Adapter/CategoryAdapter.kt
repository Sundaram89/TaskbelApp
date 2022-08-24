package com.example.taskbell_hubapp.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.taskbell_hubapp.R
import com.example.taskbell_hubapp.model.CategoryModel

class CategoryAdapter (var context: Context, var arrayList: ArrayList<CategoryModel>):
    BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var view : View = View.inflate(context, R.layout.catagaries,null)
        var resturant_logo1: ImageView =view.findViewById(R.id.resturant_logo1)
        var resturant_name1 : TextView =view.findViewById(R.id.resturant_name1)
        var resturantList: CategoryModel=arrayList.get(position)
        resturant_logo1.setImageResource(resturantList.resturant_logo1!!)
        resturant_name1.text=resturantList.resturant_name1!!
        return view
    }
}