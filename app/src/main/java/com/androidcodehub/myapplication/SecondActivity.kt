package com.androidcodehub.myapplication


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    lateinit internal var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main1)

        tv1 = findViewById<View>(R.id.textView) as TextView

        if (intent.extras != null) {

            val test = intent.extras!!.getString("test")

            tv1.text = test

        }

    }
}
