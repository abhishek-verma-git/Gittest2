package com.abhi.gittest2

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // this is Rijo's Edit


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv1.text="Rijo"

        txv1.text = "Gitest1"
        txv1.text = "Gitest1"
        txv1.text = "Gitest1"

        txv2.text="dfdfdf"

        txv1.visibility = GONE



    }
}
