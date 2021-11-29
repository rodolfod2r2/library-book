package org.framework.rodolfo.freire.git.library.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Gender {

    MALE,
    FEMALE,
    OTHERS;

    private String description;

}
