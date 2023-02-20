package com.javierlabs.studentgradedata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.javierlabs.studentgradedata.viewmodel.StudentListViewModel;

import java.lang.reflect.Array;

public class StudentActivity extends MenuActivity {
    private EditText nameEditText;
    private EditText surnameEditText;
    private EditText gradeEditText;
    private EditText idEditText;
    private StudentListViewModel mStudentListViewModel;
    private CustomAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        //instantiate views
        nameEditText = findViewById(R.id.name_edit_text);
        surnameEditText = findViewById(R.id.surname_edit_text);
        gradeEditText = findViewById(R.id.grade_edit_text);
        idEditText = findViewById(R.id.id_edit_text);

        String data[] = new String[4];

        Bundle intentExtras = getIntent().getExtras();
        if(intentExtras != null){
            data[0] = intentExtras.getString("name");
            data[1] = intentExtras.getString("surname");
            data[2] = intentExtras.getString("grade");
            data[3] = intentExtras.getString("id");
            nameEditText.setText(data[0]);
            surnameEditText.setText(data[1]);
            gradeEditText.setText(data[2]);
            idEditText.setText(data[3]);
        }




    }


}