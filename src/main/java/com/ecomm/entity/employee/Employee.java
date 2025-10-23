package com.ecomm.entity.employee;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    @NonNull
    private String name;
    @NonNull
    @Column(name = "salary")
    private String salary;
}
