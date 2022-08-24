package com.example.taskbell_hubapp.Fragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskbell_hubapp.Adapter.TopRatedMemberAdapter
import com.example.taskbell_hubapp.R
import com.example.taskbell_hubapp.model.TopRatedMemberModel

class ExploreFragement : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_explore_fragement, container, false)
        val detailMenu_recycleview=view.findViewById<RecyclerView>(R.id.call_recycleview)
        detailMenu_recycleview.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val data8=ArrayList<TopRatedMemberModel>()
        data8.add(TopRatedMemberModel(R.drawable.member,"Natalia Sharma","6 Hours",R.drawable.callicon))
        data8.add(TopRatedMemberModel(R.drawable.member,"Natalia Sharma","6 Hours",R.drawable.callicon))
        data8.add(TopRatedMemberModel(R.drawable.member,"Natalia Sharma","6 Hours",R.drawable.callicon))
        data8.add(TopRatedMemberModel(R.drawable.member,"Natalia Sharma","6 Hours",R.drawable.callicon))
        val adapter4= TopRatedMemberAdapter(data8)
        detailMenu_recycleview.adapter=adapter4
        return view
    }
}

