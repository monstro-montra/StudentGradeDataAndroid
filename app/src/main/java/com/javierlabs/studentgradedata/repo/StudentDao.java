package com.javierlabs.studentgradedata.repo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.javierlabs.studentgradedata.model.Student;

import java.util.List;

@Dao
public interface StudentDao {
    @Query("SELECT * FROM Student WHERE id = :id")
    Student getStudent(long id);

    @Query("SELECT * FROM Student ORDER BY name COLLATE NOCASE")
    List<Student> getStudents();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addStudent(Student student);

    @Update
    void updateStudent(Student student);

    @Delete
    void deleteStudent(Student student);
}
