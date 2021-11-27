package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.math.BigDecimal;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends Person {

    @Column(name = "gender")
    private String gender;
    @Column(name = "department")
    @Enumerated(EnumType.STRING)
    private Department department;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "income")
    private BigDecimal employeeIncome;

}
