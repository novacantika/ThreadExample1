package com.example.threadexample1

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import android.util.Log
import java.lang.Math.log

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startThread(view: View):Unit {
        for (i in 1..10) {
            Log.d(TAG, "startTheard: $i")
            try {
                Thread.sleep(1000)
            } catch (ie:InterruptedException) {
                ie.printStackTrace()
            }
        }
    }
}