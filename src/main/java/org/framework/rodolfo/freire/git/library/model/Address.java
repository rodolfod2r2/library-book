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
    @Column(name = "address_id")
    private long addressId;
    @Column(name = "address_type")
    private String addressType;
    @Column(name = "address_postal_code")
    private String postalCode;
    @Column(name = "address_street")
    private String streetLine1;
    @Column(name = "address_number")
    private String streetLine2;
    @Column(name = "address_district")
    private String streetLine3;
    @Column(name = "address_adjunct")
    private String streetLine4;
    @Column(name = "address_city")
    private String city;
    @Column(name = "address_state")
    private String state;
    @Column(name = "address_country")
    private String country;
    @Column(name = "address_preferred")
    private boolean addressPreferred;
    @Column(name = "address_status")
    private boolean addressStatus;

}
