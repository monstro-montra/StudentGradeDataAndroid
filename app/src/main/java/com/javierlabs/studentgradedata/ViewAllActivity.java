package com.javierlabs.studentgradedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.javierlabs.studentgradedata.model.Student;
import com.javierlabs.studentgradedata.viewmodel.StudentListViewModel;

import java.util.List;

public class ViewAllActivity extends MenuActivity {
    private ScrollView mStudentListScrollView;
    private StudentListViewModel mStudentListViewModel;
    private Button mAddStudentButton;
    private TextView mStudentListItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        mStudentListViewModel = new StudentListViewModel(getApplication());
        mStudentListScrollView = findViewById(R.id.student_scroll_view);
        mStudentListItem = findViewById(R.id.student_list_item);
    }

    @Override
    protected void onResume(){
        super.onResume();
        displayList();
    }

    private void displayList() {
        StringBuffer itemText = new StringBuffer();
        List<Student> items = mStudentListViewModel.getStudents();
        for(int i = 0; i < items.size(); i++){
            itemText.append(i + 1)
                    .append(". ")
                    .append(items.get(i).getName())
                    .append("\n");
        }

        mStudentListItem.setText(itemText);
    }

}