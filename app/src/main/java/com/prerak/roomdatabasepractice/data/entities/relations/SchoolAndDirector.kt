package com.prerak.roomdatabasepractice.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.prerak.roomdatabasepractice.data.entities.Director
import com.prerak.roomdatabasepractice.data.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)
