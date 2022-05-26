package com.students.studentservice.Service;

import com.students.studentservice.Entity.StudentEntity;
import com.students.studentservice.Repository.StudentRepository;
import com.students.studentservice.ValueObjects.Department;
import com.students.studentservice.ValueObjects.ResponseTypeValueObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public ResponseTypeValueObjects getStudent(Long studentId) {
        ResponseTypeValueObjects responseTypeValueObjects = new ResponseTypeValueObjects();
        StudentEntity student = studentRepository.findByStudentId(studentId);

        Department department = restTemplate.getForObject("http://localhost:8081/department/" + student.getDepartmentId(), Department.class);

        responseTypeValueObjects.setStudentEntity(student);
        responseTypeValueObjects.setDepartment(department);

        return responseTypeValueObjects;
    }
}
