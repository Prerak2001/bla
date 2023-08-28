package com.prerak.roomdatabasepractice.data.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.prerak.roomdatabasepractice.data.entities.Student
import com.prerak.roomdatabasepractice.data.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject : Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students : List<Student>
)
