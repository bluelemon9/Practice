package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    // 안드로이드에서 extention 없어짐
//    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).allowMainThreadQueries()
            .build()

//        db.todoDao().getAll().observe(this, Observer {
//            result_text.text = it.toString()
//        })
////       binding.result_text.text = db.todoDao().getAll().toString()
////       result_text.text = db.todoDao().getAll().toString()
//
//        add_button.setOnClickListener {
//            db.todoDao().insert(Todo(todo_edit.text.toString()))
////            result_text.text = db.todoDao().getAll().toString()
//        }
    }
}