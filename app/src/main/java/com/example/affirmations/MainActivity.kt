package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)
//        GridLayoutManager(
//            this, // context
//            3, // span count
//            RecyclerView.VERTICAL, // orientation
//            false // reverse layout
//        ).apply {
//            // specify the layout manager for recycler view
//            recyclerView.layoutManager = this
//        }

        recyclerView.adapter = ItemAdapter (this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}