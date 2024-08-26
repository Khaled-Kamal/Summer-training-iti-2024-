package com.example.weekdays

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)


        val daysOfWeek = arrayOf("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, daysOfWeek)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val day = parent.getItemAtPosition(position) as String
            Toast.makeText(this, day, Toast.LENGTH_SHORT).show()
        }
    }
}
