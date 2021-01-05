package com.example.practice

import androidx.room.PrimaryKey

data class Todo (
            var title: String
){
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}