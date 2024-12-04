package com.example.demoroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoroomdb.db.Color
import com.example.demoroomdb.db.ColorDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorDao = ColorDatabase.getInstance(application).colorDao()
        val newColor = Color(_id=0,hex = "#6200EE", name = "purple")

        Thread {
            colorDao.insert(newColor)
        }.start()
    }
}