package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    private long employeeId;
    private long employeeCode;
    private String employeeType;
    private String employeeIdNational;
    private String employeeName;
    private String employeeGender;
    private Date employeeBirthday;
    private Date employeeRelationshipDate;
    private Department employeeDepartment;
    private String employeeOccupation;
    private BigDecimal employeeIncome;
    private Address employeeAddress;
    private Phone employeePhone;
    private String employeeEmail;
    private String employeePassword;
    private String employeeAccessLevels;
    private boolean employeeStatus;


}
