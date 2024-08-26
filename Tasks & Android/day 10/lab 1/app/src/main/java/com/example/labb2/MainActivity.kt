package com.example.recyclerviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data
        val items = listOf(
            Item(R.drawable.ic_launcher_foreground, "Title 1", "Subtitle 1"),
            Item(R.drawable.ic_launcher_foreground, "Title 2", "Subtitle 2"),
            Item(R.drawable.ic_launcher_foreground, "Title 3", "Subtitle 3"),
            Item(R.drawable.ic_launcher_foreground, "Title 4", "Subtitle 4"),
            Item(R.drawable.ic_launcher_foreground, "Title 5", "Subtitle 5")
        )

        // Initialize RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(items)
    }
}
