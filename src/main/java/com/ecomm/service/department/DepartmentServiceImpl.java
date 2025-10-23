package com.ecomm.service.department;

import com.ecomm.dto.department.DepartmentDto;
import com.ecomm.entity.department.Department;
import com.ecomm.entity.employee.Employee;
import com.ecomm.mapper.department.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
    private final DepartmentMapper departmentMapper;
    @Override
    public List<DepartmentDto> getDepartments(DepartmentDto departmentDto) {
        Employee employee=new Employee();
        employee.setName("samon");
        employee.setSalary("18000");
        employee.setId(120);
        List<Employee> employees=new ArrayList<>();
        employees.add(employee);
        Department department=new Department();
        department.setId(1);
        department.setName("HR");
        department.setEmployees(employees);

        List<Department> departments=new ArrayList<>();
        departments.add(department);

        return departmentMapper.map(departments);
    }

    @Override
    public Integer deleteDepartment(Integer id) {
        return 0;
    }

    @Override
    public DepartmentDto addDepartment(DepartmentDto departmentDto) {
        return null;
    }

    @Override
    public DepartmentDto updateDepartment(DepartmentDto departmentDto, Integer id) {
        return null;
    }
}
