package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum AccessLevel {

    ROOT("ROOT"),
    ADMIN("ADMIN"),
    USER("USER"),
    EMPLOYEE("EMPLOYEE"),
    CUSTOMER("CUSTOMER"),
    BUSINESS("BUSINESS");

    private String description;
}
