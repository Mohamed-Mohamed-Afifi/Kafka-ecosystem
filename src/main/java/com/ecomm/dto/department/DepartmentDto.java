package com.ecomm.dto.department;

import com.ecomm.dto.employee.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private String departmentName;
    private List<EmployeeDto> employeeDtos;
}
