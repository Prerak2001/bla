package com.prerak.roomdatabasepractice.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.security.auth.Subject

@Entity
data class StudentSubjectCrossRef(
    val studentName: String,
    val subjectName :String
)
