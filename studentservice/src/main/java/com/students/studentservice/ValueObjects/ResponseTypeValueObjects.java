package com.students.studentservice.ValueObjects;

import com.students.studentservice.Entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTypeValueObjects {
    private StudentEntity studentEntity;
    private Department department;
}
