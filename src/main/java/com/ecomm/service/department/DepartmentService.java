package com.ecomm.service.department;

import com.ecomm.dto.department.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    public List<DepartmentDto> getDepartments(DepartmentDto departmentDto);
    public Integer deleteDepartment(Integer id);
    public DepartmentDto addDepartment(DepartmentDto departmentDto);
    public DepartmentDto updateDepartment(DepartmentDto departmentDto,Integer id);
}
