package com.prerak.roomdatabasepractice.data.entities

import androidx.room.PrimaryKey

data class StudentEntity(
    @PrimaryKey(autoGenerate = false)
    val studentName : String,
    val semester : Int,
    val schoolName : String
)
