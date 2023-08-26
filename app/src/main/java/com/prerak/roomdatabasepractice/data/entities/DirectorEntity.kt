package com.prerak.roomdatabasepractice.data.entities

import androidx.room.Entity

@Entity
data class Director(
    val directorName : String,
    val schoolName : String
)
