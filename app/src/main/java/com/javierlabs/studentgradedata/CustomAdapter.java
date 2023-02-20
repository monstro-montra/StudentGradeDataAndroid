package com.javierlabs.studentgradedata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.javierlabs.studentgradedata.model.Student;
import com.javierlabs.studentgradedata.viewmodel.StudentListViewModel;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter implements ListAdapter {
    Context context;
    List<Student> students;
    LayoutInflater inflater;


    public CustomAdapter(Context applicationContext, List<Student> studentList){
        this.context = applicationContext;
        this.students = studentList;
    }
    @Override
    public int getCount() {

        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return students.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_view_student, null);
        }

        TextView studentName = (TextView) view.findViewById(R.id.student_list_item_text_view);
        studentName.setText(students.get(i).getName()); //set the textview to the student's name

        ImageButton deleteBtn = (ImageButton) view.findViewById(R.id.delete_icon);

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                students.remove(i);
                notifyDataSetChanged();
            }
        });
        return view;
    }
}
