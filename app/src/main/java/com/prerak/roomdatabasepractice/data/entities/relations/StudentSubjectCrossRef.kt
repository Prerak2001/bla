package com.prerak.roomdatabasepractice.data.entities.relations

import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.security.auth.Subject

@Entity(primaryKeys = ["studentName", "subjectName"])
data class StudentSubjectCrossRef(
    val studentName: String,
    val subjectName: String
)
