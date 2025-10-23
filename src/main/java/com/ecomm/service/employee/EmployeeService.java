package com.ecomm.service.employee;

import com.ecomm.dto.employee.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeDto> filterEmployees(EmployeeDto employeeDto);
    public EmployeeDto addEmployee(EmployeeDto emp);
    public EmployeeDto getEmployee(Integer id);
    public EmployeeDto updateEmployee(EmployeeDto emp,Integer id);
    public Integer deleteEmployee(Integer id);
}
