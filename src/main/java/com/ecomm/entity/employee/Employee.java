package com.ecomm.entity.employee;

import com.ecomm.entity.base.BaseEntity;
import com.ecomm.entity.department.Department;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    @NonNull
    private String name;
    @NonNull
    @Column(name = "salary")
    private String salary;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

}
