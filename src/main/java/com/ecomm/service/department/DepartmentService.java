package com.ecomm.service.department;

import com.ecomm.dto.department.DepartmentDto;

import java.util.List;
import java.util.Set;

public interface DepartmentService {
    public Set<DepartmentDto> getDepartments(DepartmentDto departmentDto);
    public Integer deleteDepartment(Integer id);
    public DepartmentDto addDepartment(DepartmentDto departmentDto);
    public DepartmentDto updateDepartment(DepartmentDto departmentDto,Integer id);
}
