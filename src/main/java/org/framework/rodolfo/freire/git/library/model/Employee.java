package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long employeeId;
    @Column(name = "employee_code")
    private long employeeCode;
    @Column(name = "employee_type")
    private String employeeType;
    @Column(name = "employee_national_id")
    private String employeeIdNational;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_gender")
    private String employeeGender;
    @Column(name = "employee_birthday")
    private Date employeeBirthday;
    @Column(name = "employee_relationship_date")
    private Date employeeRelationshipDate;
    @Column(name = "employee_department")
    private Department employeeDepartment;
    @Column(name = "employee_occupation")
    private String employeeOccupation;
    @Column(name = "employee_income")
    private BigDecimal employeeIncome;
    @OneToOne
    @JoinColumn(name = "employee_address_fk")
    private Address employeeAddress;
    @OneToOne
    @JoinColumn(name = "employee_phone_fk")
    private Phone employeePhone;
    @Column(name = "employee_email")
    private String employeeEmail;
    @Column(name = "employee_password")
    private String employeePassword;
    @Column(name = "employee_level")
    private String employeeAccessLevels;
    @Column(name = "employee_status")
    private boolean employeeStatus;

}
