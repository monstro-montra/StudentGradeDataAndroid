package com.javierlabs.studentgradedata.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

@Entity
public class Student {
    //private variables
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "name")
    private String mName;

    @NonNull
    @ColumnInfo(name = "surname")
    private String mSurname;

    @NonNull
    @ColumnInfo(name = "grade")
    private String mGrade;

    @NonNull
    @ColumnInfo(name = "id")
    private String mId;

    //constructor
    public Student(@NonNull String name){
        mName = name;
    }

    //getters and setters
    public String getName() {
        return mName;
    }

    public void setName(String Name) {
        this.mName = Name;
    }

    public String getSurname() {
        return mSurname;
    }

    public void setSurname(String Surname) {
        this.mSurname = Surname;
    }

    public String getGrade() {
        return mGrade;
    }

    public void setGrade(String Grade) {
        this.mGrade = Grade;
    }

    public String getId() {
        return mId;
    }

    public void setId(String Id) {
        this.mId = Id;
    }
}
