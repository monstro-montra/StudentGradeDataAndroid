package com.javierlabs.studentgradedata;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.javierlabs.studentgradedata.model.Student;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter implements ListAdapter {
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Student> students;


    public CustomAdapter(Context applicationContext, ArrayList<Student> studentList){
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


        TextView studentName = (TextView) view.findViewById(R.id.student_list_item_text_view); //instantiate TextView from activity_view_student.xml
        studentName.setText(students.get(i).getName()); //set the textview to the student's name

        studentName.setOnClickListener(view1 -> {
            Intent intent = new Intent(context, StudentActivity.class);
            //put the data to pass onto the next activity (StudentActivity)
            intent.putExtra("name", String.valueOf(students.get(i).getName()));
            intent.putExtra("surname", String.valueOf(students.get(i).getSurname()));
            intent.putExtra("grade", String.valueOf(students.get(i).getGrade()));
            intent.putExtra("id", String.valueOf(students.get(i).getId()));
            context.startActivity(intent);
        });

        ImageButton deleteBtn = (ImageButton) view.findViewById(R.id.delete_icon); //instantiate ImageButton from activity_view_student.xml

        deleteBtn.setOnClickListener(view1 -> { //remove students(i) on click. onClickListener for the delete button
            students.remove(students.get(i));
            updateData(students);
        });
        return view;
    }
    public void updateData(ArrayList<Student> newData) {
        students = newData;
        this.notifyDataSetChanged();
    }
}

