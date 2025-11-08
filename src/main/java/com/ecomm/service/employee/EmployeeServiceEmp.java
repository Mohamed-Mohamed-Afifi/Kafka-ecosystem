package com.ecomm.service.employee;

import com.ecomm.dto.employee.EmployeeDto;
import com.ecomm.entity.employee.Employee;
import com.ecomm.mapper.employee.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceEmp implements EmployeeService{
    private final EmployeeMapper employeeMapper;
    @Override
    public Set<EmployeeDto> filterEmployees(EmployeeDto employeeDto) {
//        Here Make Quritea query that take all args and start filter

            Set<Employee> emps = new HashSet<>();
            Employee em=new Employee();
            em.setId(15512);
            em.setName("Mohamed");
            em.setSalary("15000");
            emps.add(em);
//            Stream On Employees
Set<EmployeeDto> employeeDtos=employeeMapper.map(emps);
            return employeeDtos;

    }
    @Override
    public EmployeeDto addEmployee(EmployeeDto emp) {
        return emp;
    }

    @Override
    public EmployeeDto getEmployee(Integer id) {
        return null;
    }
    @Override
    public EmployeeDto updateEmployee(EmployeeDto emp, Integer id) {
        return emp;
    }

    @Override
    public Integer deleteEmployee(Integer id) {
        return id;
    }
}
