package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

// Class
public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Integer departmentId);

    // Delete operation
    void deleteDepartmentById(Integer departmentId);
}