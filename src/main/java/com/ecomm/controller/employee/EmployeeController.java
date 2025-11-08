package com.ecomm.controller.employee;

import com.ecomm.dto.employee.EmployeeDto;
import com.ecomm.service.employee.EmployeeService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@Setter
@Getter
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    @Qualifier("employeeServiceEmp")
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Set<EmployeeDto>> getAllEmployees(@ModelAttribute EmployeeDto employeeDto){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeService.filterEmployees(employeeDto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeService.updateEmployee(employeeDto,id));
    }
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmp(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.addEmployee(employeeDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Integer> deleteEmp(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeService.deleteEmployee(id));
    }
    @GetMapping("{id}")
    public ResponseEntity<Set<EmployeeDto>> getEmployee(@PathVariable Integer id,@ModelAttribute EmployeeDto employeeDto){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeService.filterEmployees(employeeDto));
    }

//    @GetMapping("{id}")
//    public ResponseEntity<List<EmployeeDto>> getEmployee(@PathVariable Integer id,@RequestParam String name,@RequestParam String salary){
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeService.getAllEmployees());
//    }

}
