package com.prerak.roomdatabasepractice.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SubjectEntity(
    @PrimaryKey(autoGenerate = false)
    val subjectName: String
)
