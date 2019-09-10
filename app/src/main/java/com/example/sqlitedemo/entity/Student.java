package com.example.sqlitedemo.entity;

import java.io.Serializable;

public class Student implements Serializable {
    public static final String TBL_Student = "create table if not exists student(" +
            "id integer primary key autoincrement," +
            "name varchar(20)," +
            "age integer,"+
            "class_name varchar(20)";

    private String class_name;
    private int age;
    private String  name;

    public Student(){

    }
    public Student(String name, int age,  String class_name) {
        this.name = name;
        this.class_name = class_name;
        this.age = age;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", class_name='" + class_name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
