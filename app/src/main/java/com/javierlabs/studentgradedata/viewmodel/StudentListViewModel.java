package com.javierlabs.studentgradedata.viewmodel;

import android.app.Application;

import com.javierlabs.studentgradedata.model.Student;
import com.javierlabs.studentgradedata.repo.StudentRepository;

import java.util.List;

public class StudentListViewModel {
    private StudentRepository studentRepo;

    public StudentListViewModel(Application application) {
        studentRepo = StudentRepository.getInstance(application.getApplicationContext());
    }

    public List<Student> getStudents(){
        return studentRepo.getStudents();
    }

    public void addStudent(Student student) {
        studentRepo.addStudent(student);
    }

    public void deleteStudent(Student student) {
        studentRepo.deleteStudent(student);
    }
}
