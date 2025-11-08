package com.ecomm.mapper.department;

import com.ecomm.dto.department.DepartmentDto;
import com.ecomm.entity.department.Department;
import com.ecomm.mapper.employee.EmployeeMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring",uses = {EmployeeMapper.class})
public interface DepartmentMapper {
    @Mapping(source = "departmentName",target = "name")
    @Mapping(source = "employeeDtos",target = "employees")
    Department unmap(DepartmentDto departmentDto);
    Set<Department> unmap(Set<DepartmentDto> departmentDtos);
    
    @Mapping(target = "departmentName",source = "name")
    @Mapping(target = "employeeDtos",source = "employees")
    DepartmentDto map(Department department);
    Set<DepartmentDto> map(Set<Department> departments);
}
