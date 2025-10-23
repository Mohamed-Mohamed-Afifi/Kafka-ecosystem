package com.ecomm.controller.deparment;

import com.ecomm.dto.department.DepartmentDto;
import com.ecomm.dto.employee.EmployeeDto;
import com.ecomm.service.department.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getDepartment(@ModelAttribute DepartmentDto departmentDto){
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.getDepartments(departmentDto));
    }
}
