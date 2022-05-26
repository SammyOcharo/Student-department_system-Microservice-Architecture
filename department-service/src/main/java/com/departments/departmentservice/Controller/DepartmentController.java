package com.departments.departmentservice.Controller;

import com.departments.departmentservice.Entity.DepartmentEntity;
import com.departments.departmentservice.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public DepartmentEntity saveDepartment (@RequestBody DepartmentEntity departmentEntity){
        return departmentService.saveDepartment(departmentEntity);
    }

    @GetMapping("/{id}")
    public DepartmentEntity getDepartment (@PathVariable("id") Long departmentId){
        return departmentService.getDepartment(departmentId);
    }
}
