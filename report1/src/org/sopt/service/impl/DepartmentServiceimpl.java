package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceimpl implements DepartmentService {
    @Override
    public Department getByDepName(String deptName) {
//        return null;
        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        Department department = departmentBuilder
                .build();

        return department;
    }
}
