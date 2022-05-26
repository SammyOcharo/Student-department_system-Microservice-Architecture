package com.departments.departmentservice.Service;

import com.departments.departmentservice.Entity.DepartmentEntity;
import com.departments.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {

         return departmentRepository.save(departmentEntity);

    }

    public DepartmentEntity getDepartment(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
