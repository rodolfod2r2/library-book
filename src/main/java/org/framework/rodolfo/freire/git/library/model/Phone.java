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
public class Phone {

    private long phoneId;
    private String phoneType;
    private String phoneNumber;
    private boolean PhonePreferred;
    private boolean PhoneStatus;

}
