package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {

    private long customerId;
    private long customerCode;
    private String customerType;
    private String customerIdNational;
    private String customerName;
    private String customerGender;
    private Date customerBirthday;
    private Date customerRelationshipDate;
    private Address customerAddress;
    private Phone customerPhone;
    private String customerEmail;
    private boolean customerStatus;

}
