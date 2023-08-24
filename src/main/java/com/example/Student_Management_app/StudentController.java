package com.example.Student_Management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regno){
        return studentService.getStudent(regno);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/update-age")
    public Student updateAge(@RequestParam("q") int regno, @RequestParam("age") int newAge){
        return studentService.updateAge(regno, newAge);
    }

    @GetMapping("/getbyPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regno){
        return studentService.getStudentUsingPath(regno);
    }
    @DeleteMapping("/delete")
     public String deleteStudent(@RequestParam("q") int regno){
        return studentService.deleteStudent(regno);
    }
    @DeleteMapping("/deletebyPath/{id}")
    public String deletebyaPath(@PathVariable("id") int regno){
        return studentService.deletebyPath(regno);
    }
    @PutMapping("/courseChange")
    public Student courseChange(@RequestParam("q") int regno,@RequestParam("q1") String newCourse){
        return studentService.courseChange(regno,newCourse);
    }
    @PutMapping("/courseChangebyPath/{id}/{q1}")
    public Student courseChangeByPath(@PathVariable("id") int regno,@PathVariable("q1") String newCourse){
        return studentService.courseChangebyPath(regno,newCourse);
    }


}
