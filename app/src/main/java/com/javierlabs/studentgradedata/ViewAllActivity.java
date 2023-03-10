package com.javierlabs.studentgradedata;

import android.os.Bundle;
import android.widget.ListView;

import com.javierlabs.studentgradedata.model.Student;
import com.javierlabs.studentgradedata.viewmodel.StudentListViewModel;

import java.util.ArrayList;
import java.util.List;

public class ViewAllActivity extends MenuActivity {
    private ListView mStudentListView;
    private StudentListViewModel mStudentListViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);
        mStudentListViewModel = new StudentListViewModel(getApplication());;
        ArrayList<Student> students = (ArrayList<Student>) mStudentListViewModel.getStudents();

        CustomAdapter adapter = new CustomAdapter(this, students);


        mStudentListView = findViewById(R.id.student_list_view);
        mStudentListView.setAdapter(adapter);
        adapter.updateData(students);

    }

    @Override
    protected void onResume(){
        super.onResume();
    }
}