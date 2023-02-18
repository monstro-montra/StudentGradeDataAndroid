package com.javierlabs.studentgradedata.repo;

import android.content.Context;
import androidx.room.Room;
import com.javierlabs.studentgradedata.model.Student;
import java.util.List;

public class StudentRepository {
    private static StudentRepository mStudentRepo;
    private final StudentDao mStudentDao;

    public static StudentRepository getInstance(Context context) {
        if(mStudentRepo == null) {
            mStudentRepo = new StudentRepository(context);
        }
        return mStudentRepo;
    }

    private StudentRepository(Context context) {
        StudentDatabase database = Room.databaseBuilder(context, StudentDatabase.class, "student.db")
                .allowMainThreadQueries()
                .build();

        mStudentDao = database.studentDao();

        if(mStudentDao.getStudents().isEmpty()) {
            addStarterData();
        }
    }

    private void addStarterData(){
        //add some students for testing purposes
        Student student = new Student("Alex");
        student.setId(123);
        long studentId = mStudentDao.addStudent(student);

        student = new Student("Lorenzo");
        mStudentDao.addStudent(student);

        student = new Student("Michael");
        mStudentDao.addStudent(student);
    }

    public void addStudent(Student student) {
        long studentId = mStudentDao.addStudent(student);
        student.setId(studentId);
    }

    public Student getStudent(long studentId){

        return mStudentDao.getStudent(studentId);
    }
    public List<Student> getStudents() {

        return mStudentDao.getStudents();
    }

    public void deleteStudent(Student student){
        mStudentDao.deleteStudent(student);
    }

    public void updateStudent(Student student){
        mStudentDao.updateStudent(student);
    }
}
