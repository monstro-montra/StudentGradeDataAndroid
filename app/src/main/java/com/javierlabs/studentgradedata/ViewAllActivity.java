package com.javierlabs.studentgradedata;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.javierlabs.studentgradedata.model.Student;
import com.javierlabs.studentgradedata.viewmodel.StudentListViewModel;

import java.util.List;

public class ViewAllActivity extends MenuActivity {
    private ListView mStudentListView;
    private StudentListViewModel mStudentListViewModel;
    private Button mAddStudentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        mStudentListViewModel = new StudentListViewModel(getApplication());
        mStudentListView = findViewById(R.id.student_list_view);

    }

    @Override
    protected void onResume(){
        super.onResume();
        displayList();
    }

    private void displayList() {
        TextView mStudentListItemTextView = findViewById(R.id.student_list_item_text_view);
        StringBuffer itemText = new StringBuffer();
        List<Student> items = mStudentListViewModel.getStudents();
        for(int i = 0; i < items.size(); i++){
            itemText.append(i + 1)
                    .append(". ")
                    .append(items.get(i).getName())
                    .append("\n");
        }

        mStudentListItemTextView.setText(itemText);
    }

}