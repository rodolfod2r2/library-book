package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customerId;
    @Column(name = "customer_code")
    private long customerCode;
    @Column(name = "customer_type")
    private String customerType;
    @Column(name = "customer_national_id")
    private String customerIdNational;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_gender")
    private String customerGender;
    @Column(name = "customer_birthdayr")
    private Date customerBirthday;
    @Column(name = "customer_relationship_date")
    private Date customerRelationshipDate;
    @OneToOne
    @JoinColumn(name = "customer_address_fk")
    private Address customerAddress;
    @OneToOne
    @JoinColumn(name = "customer_phone_fk")
    private Phone customerPhone;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "customer_password")
    private String customerPassword;
    @Column(name = "customer_status")
    private boolean customerStatus;

}
