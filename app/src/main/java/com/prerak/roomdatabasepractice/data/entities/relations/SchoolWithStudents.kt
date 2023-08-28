package com.prerak.roomdatabasepractice.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.prerak.roomdatabasepractice.data.entities.School
import com.prerak.roomdatabasepractice.data.entities.Student

data class SchoolWithStudents(
    @Embedded val schoolName  : School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students : List<Student>
)
