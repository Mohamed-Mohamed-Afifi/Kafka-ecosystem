package com.ecomm.mapper.employee;

import com.ecomm.dto.employee.EmployeeDto;
import com.ecomm.entity.employee.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
//    EmployeeMapper INSTANCE= Mappers.getMapper(EmployeeMapper.class);
    @Mapping(source = "name",target = "employeeName")
    @Mapping(source = "salary",target = "employeeSalary")
    EmployeeDto map(Employee employee);
    Set<EmployeeDto> map(Set<Employee> employees);

    @Mapping(target = "name",source = "employeeName")
    @Mapping(target = "salary",source = "employeeSalary")
    Employee unmap(EmployeeDto employeeDto);
    Set<Employee> unmap(Set<EmployeeDto> employees);
}
