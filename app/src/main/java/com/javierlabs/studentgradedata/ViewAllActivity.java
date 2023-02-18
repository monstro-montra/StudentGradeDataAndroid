package com.javierlabs.studentgradedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import com.javierlabs.studentgradedata.viewmodel.StudentListViewModel;

public class ViewAllActivity extends AppCompatActivity {
    private ScrollView mScrollView;
    private StudentListViewModel mStudentListViewModel;
    private Button mAddStudentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        mStudentListViewModel = new StudentListViewModel(getApplication());

        mAddStudentButton = findViewById(R.id.add_student_button);

        mAddStudentButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), StudentActivity.class);
            view.getContext().startActivity(intent);
        });
    }

}