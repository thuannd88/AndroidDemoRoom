package com.example.demoroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoroomdb.db.Color
import com.example.demoroomdb.db.ColorDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private val mainScope = CoroutineScope(Dispatchers.Main + Job())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorDao = ColorDatabase.getInstance(application).colorDao()
        val newColor = Color(_id=0,hex = "#6200EE", name = "purple")

        mainScope.launch {
            withContext(Dispatchers.IO){
                val colors = colorDao.getAll()
                var x=1
            }
        }

//        Thread {
//            val colors = colorDao.getAll()
//        }.start()
    }
}