package com.prerak.roomdatabasepractice.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.prerak.roomdatabasepractice.data.entities.Director
import com.prerak.roomdatabasepractice.data.entities.School
import com.prerak.roomdatabasepractice.data.entities.Student
import com.prerak.roomdatabasepractice.data.entities.Subject
import com.prerak.roomdatabasepractice.data.entities.relations.SchoolAndDirector
import com.prerak.roomdatabasepractice.data.entities.relations.SchoolWithStudents
import com.prerak.roomdatabasepractice.data.entities.relations.StudentSubjectCrossRef
import com.prerak.roomdatabasepractice.data.entities.relations.StudentWithSubjects
import com.prerak.roomdatabasepractice.data.entities.relations.SubjectWithStudents

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirector(schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>

    @Transaction
    @Query("SELECT * FROM student WHERE studentName = :studentName")
    suspend fun getStudentWithSubjects(studentName: String): List<StudentWithSubjects>

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun getSubjectWithStudents(subjectName : String): List<SubjectWithStudents>

   // changed

}