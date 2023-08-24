package com.example.Student_Management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(int regno){
        return studentRepository.getStudent(regno);
    }
    public String addStudent(Student student){
      return  studentRepository.addStudent(student);
    }

    public Student updateAge(int regno,int newAge){
        return studentRepository.updateAge(regno, newAge);
    }
    public Student getStudentUsingPath(int regno){
        return studentRepository.getStudentUsingPath(regno);
    }

    public String deleteStudent(int regno) {
        return studentRepository.deleteStudent(regno);
    }

    public String deletebyPath(int regno) {
        return studentRepository.deletebyPath(regno);
    }

    public Student courseChange(int regno, String newCourse) {
        return studentRepository.courseChange(regno,newCourse);
    }

    public Student courseChangebyPath(int regno, String newCourse) {
        return studentRepository.courseChangebyPath(regno,newCourse);
    }


}
