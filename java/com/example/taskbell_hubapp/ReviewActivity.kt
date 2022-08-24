package com.example.taskbell_hubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.taskbell_hubapp.Adapter.ViewPagerAdapter
import com.example.taskbell_hubapp.model.ItemClassModel
import com.example.taskbell_hubapp.model.TopRatedMemberModel

class ReviewActivity : AppCompatActivity() {
    private lateinit var iv1: ImageView
    private lateinit var iv2: ImageView
    private lateinit var iv3: ImageView
    private lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)
        viewPager2=findViewById(R.id.view_pager2)
        iv1=findViewById(R.id.iv1)
        iv2=findViewById(R.id.iv2)
        iv3=findViewById(R.id.iv3)
        val data9=ArrayList<ItemClassModel>()
        data9.add(ItemClassModel(R.drawable.womenselectingclothes2,"Natalia Sharma","New Delhi, (Laundry)","6 Hours"))
        data9.add(ItemClassModel(R.drawable.womenselectingclothes2,"Natalia Sharma","New Delhi, (Laundry)","6 Hours"))
        data9.add(ItemClassModel(R.drawable.womenselectingclothes2,"Natalia Sharma","New Delhi, (Laundry)","6 Hours"))
        val adapter = ViewPagerAdapter(data9)
        viewPager2.adapter=adapter
        viewPager2.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                changeColor()
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                changeColor()
            }
        })
    }
    fun changeColor(){
        when(viewPager2.currentItem)
        {
            0->{
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.black))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.white1))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.white1))
            }
            1->{
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.white1))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.black))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.white1))
            }
            2->{
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.white1))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.white1))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.black))
            }

        }
    }
}