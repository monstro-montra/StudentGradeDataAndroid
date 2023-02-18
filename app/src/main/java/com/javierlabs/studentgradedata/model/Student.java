package com.javierlabs.studentgradedata.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

@Entity
public class Student {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private long mId;
    //private variables
    @NonNull
    @ColumnInfo(name = "name")
    private String mName;

    @ColumnInfo(name = "surname")
    private String mSurname;

    @NonNull
    @ColumnInfo(name = "grade")
    private float mGrade;

    //constructor
    @Ignore
    public Student(@NonNull String name){

        mName = name;
    }

    //second constructor
    public Student(@NonNull long id){

        mId = id;
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

    public float getGrade() {
        return mGrade;
    }

    public void setGrade(float Grade) {
        this.mGrade = Grade;
    }

    public long getId() {
        return mId;
    }

    public void setId(long Id) {
        this.mId = Id;
    }
}
