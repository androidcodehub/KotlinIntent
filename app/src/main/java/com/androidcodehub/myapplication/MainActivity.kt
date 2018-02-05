package com.androidcodehub.myapplication


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    internal lateinit var bt1: Button
    internal lateinit var et1: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById<View>(R.id.edit1) as EditText
        bt1 = findViewById<View>(R.id.button) as Button


        bt1.setOnClickListener {
            if (et1.text.toString().matches("".toRegex())) {


            } else {

                val i = Intent(this@MainActivity, SecondActivity::class.java)

                val b = Bundle()
                b.putString("test", et1.text.toString())
                i.putExtras(b)

                startActivity(i)

            }
        }


    }
}
