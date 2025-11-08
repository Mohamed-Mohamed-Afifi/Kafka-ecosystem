package com.ecomm.service.employee;

import com.ecomm.dto.employee.EmployeeDto;

import java.util.List;
import java.util.Set;

public interface EmployeeService {
    public Set<EmployeeDto> filterEmployees(EmployeeDto employeeDto);
    public EmployeeDto addEmployee(EmployeeDto emp);
    public EmployeeDto getEmployee(Integer id);
    public EmployeeDto updateEmployee(EmployeeDto emp,Integer id);
    public Integer deleteEmployee(Integer id);
}
