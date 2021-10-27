package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Department {

    CASHIER("CASHIER"),
    MANAGER("MANAGER"),
    LIBRARIAN("LIBRARIAN");

    private String description;

}
