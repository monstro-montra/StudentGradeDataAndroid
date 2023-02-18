package com.javierlabs.studentgradedata.repo;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.javierlabs.studentgradedata.model.Student;

@Database(entities = {Student.class}, version = 1)
public abstract class StudentDatabase extends RoomDatabase{
    public abstract StudentDao studentDao();
}
