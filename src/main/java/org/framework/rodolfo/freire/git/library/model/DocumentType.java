package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum DocumentType {

    NATIONAL_ID("NATIONAL_ID"),
    ID_CARD("ID_CARD"),
    SOCIAL_SECURITY_CARD("SOCIAL_SECURITY_CARD"),
    DRIVER_LICENSE("DRIVER_LICENSE"),
    PROFESSIONAL_IDENTITY_CARD("PROFESSIONAL_IDENTITY_CARD"),
    MILITARY_IDENTIFICATION("MILITARY_IDENTIFICATION"),
    PASSPORT("PASSPORT"),
    STATE_REGISTRATION("STATE_REGISTRATION"),
    MUNICIPAL_REGISTRATION("MUNICIPAL_REGISTRATION");

    private String description;
}
