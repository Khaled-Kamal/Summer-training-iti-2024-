package com.example.lab3

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box_one, box_two, box_three, box_four, box_five, red_button, yellow_button, green_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three -> view.setBackgroundColor(Color.RED)
            R.id.box_four -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five -> view.setBackgroundColor(Color.GREEN)

            R.id.red_button -> box_three.setBackgroundColor(Color.RED)
            R.id.yellow_button -> box_four.setBackgroundColor(Color.YELLOW)
            R.id.green_button -> box_five.setBackgroundColor(Color.GREEN)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
