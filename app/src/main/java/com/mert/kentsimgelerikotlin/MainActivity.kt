package com.mert.kentsimgelerikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mert.kentsimgelerikotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

         landmarkList = ArrayList<Landmark>()


        val collesium = Landmark("collesium" , "italy" , R.drawable.collesium)
        val eiffel = Landmark("eiffel" , "france" , R.drawable.eyfel)
        val londonBridge = Landmark("collesium" , "England" , R.drawable.londonn)
        val pisa = Landmark("pisa" , "italy" , R.drawable.pisa)

        landmarkList.add(eiffel)
        landmarkList.add(collesium)

        landmarkList.add(londonBridge)
        landmarkList.add(pisa)


        binding.RecylerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(landmarkList)
        binding.RecylerView.adapter = adapter
    }






}