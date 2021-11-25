package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long addressId;
    @Column(name = "address_type")
    private String addressType;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "street")
    private String streetLine1;
    @Column(name = "number")
    private String streetLine2;
    @Column(name = "district")
    private String streetLine3;
    @Column(name = "adjunct")
    private String streetLine4;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "preferred")
    private boolean addressPreferred;
    @Column(name = "status")
    private boolean addressStatus;

}
