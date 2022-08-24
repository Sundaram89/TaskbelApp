package com.example.taskbell_hubapp.Fragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.taskbell_hubapp.Adapter.CategoryAdapter
import com.example.taskbell_hubapp.Adapter.CummintyAdapter
import com.example.taskbell_hubapp.R
import com.example.taskbell_hubapp.model.CategoryModel
import com.example.taskbell_hubapp.model.CumminityModel


class HomeFragement : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var data2: ArrayList<CategoryModel>? = null
        var popular_resturant: GridView? = null
        var popularResturantadapter: CategoryAdapter? = null
        var view = inflater.inflate(R.layout.fragment_home_fragement, container, false)
        val imageSlider = view.findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.logo))
        imageList.add(SlideModel(R.drawable.logo))
        imageList.add(SlideModel(R.drawable.logo))
        imageList.add(SlideModel(R.drawable.logo))
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        val nearest_resturnt1=view?.findViewById<RecyclerView>(R.id.nearest_resturant1)
        nearest_resturnt1?.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val data=ArrayList<CumminityModel>()
        data.add(CumminityModel(R.drawable.maskgroup1))
        data.add(CumminityModel(R.drawable.maskgroup1))
        data.add(CumminityModel(R.drawable.maskgroup1))
        data.add(CumminityModel(R.drawable.maskgroup1))
        data.add(CumminityModel(R.drawable.maskgroup1))

        val adapter = CummintyAdapter(data)
        // Setting the Adapter with the recyclerview
        nearest_resturnt1?.adapter = adapter
        popular_resturant = view.findViewById(R.id.nearest_resturant)
        data2 = ArrayList()
        data2 = setDataList()
        popularResturantadapter = CategoryAdapter(requireContext(), data2!!)
        popular_resturant?.adapter = popularResturantadapter

        return view


}

    private fun setDataList(): ArrayList<CategoryModel>? {
        var data2: ArrayList<CategoryModel> = ArrayList()
        data2.add(CategoryModel(R.drawable.ic_group_1781,"Vegan Resto"))
        data2.add(CategoryModel(R.drawable.ic_group_1781,"Healthy Food"))
        data2.add(CategoryModel(R.drawable.ic_group_1781,"Vegan Resto"))
        data2.add(CategoryModel(R.drawable.ic_group_1781,"Healthy Food"))
        data2.add(CategoryModel(R.drawable.ic_group_1781,"Vegan Resto"))
        data2.add(CategoryModel(R.drawable.ic_group_1781,"Healthy Food"))

        return data2
    }



}

