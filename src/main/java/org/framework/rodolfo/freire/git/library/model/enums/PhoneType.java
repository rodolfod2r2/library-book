package org.framework.rodolfo.freire.git.library.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum PhoneType {

    RESIDENTIAL,
    COMMERCIAL,
    PERSONAL;

    private String description;
}
