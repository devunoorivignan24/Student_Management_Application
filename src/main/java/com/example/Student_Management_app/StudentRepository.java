package com.example.Student_Management_app;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> db=new HashMap<>();

    public Student getStudent(int regno){
        return db.get(regno);
    }
    public String addStudent(Student student){
        db.put(student.getRegno(),student);
        return "student details added successfully";
    }
    public Student updateAge(int regno,int newAge){
        db.get(regno).setAge(newAge);
        return db.get(regno);
    }
    public Student getStudentUsingPath(int regno){
        return db.get(regno);
    }


    public String deleteStudent(int regno) {
        db.remove(regno);
        return "student is removed from database";
    }

    public String deletebyPath(int regno) {
        db.remove(regno);
        return "student is removed from database";
    }

    public Student courseChange(int regno, String newCourse) {
        db.get(regno).setCourse(newCourse);
        return db.get(regno);
    }

    public Student courseChangebyPath(int regno, String newCourse) {
        db.get(regno).setCourse(newCourse);
        return db.get(regno);
    }


}
