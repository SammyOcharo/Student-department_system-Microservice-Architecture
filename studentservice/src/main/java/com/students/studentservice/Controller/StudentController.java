package com.students.studentservice.Controller;

import com.students.studentservice.Entity.StudentEntity;
import com.students.studentservice.Service.StudentService;
import com.students.studentservice.ValueObjects.ResponseTypeValueObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);
    }

    @GetMapping("/{id}")
    public ResponseTypeValueObjects getStudent(@PathVariable("id") Long studentId){
        return studentService.getStudent(studentId);
    }
}
