package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    private long addressId;
    private String addressType;
    private String postalCode;
    private String streetLine1;
    private String streetLine2;
    private String streetLine3;
    private String streetLine4;
    private String city;
    private String state;
    private String country;
    private boolean addressPreferred;
    private boolean PhoneStatus;

}
