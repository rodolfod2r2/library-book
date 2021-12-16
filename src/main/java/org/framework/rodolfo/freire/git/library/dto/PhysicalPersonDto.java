package org.framework.rodolfo.freire.git.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.model.Address;
import org.framework.rodolfo.freire.git.library.model.Document;
import org.framework.rodolfo.freire.git.library.model.Phone;
import org.framework.rodolfo.freire.git.library.model.enums.AccessLevel;

import java.util.Date;
import java.util.List;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhysicalPersonDto {

    private long id;
    private long codeNumber;
    private String name;
    private List<Document> documents;
    private Date birthday;
    private Date relationshipDate;
    private List<Address> addresses;
    private List<Phone> phones;
    private String email;
    private String password;
    private AccessLevel accessLevel;
    private boolean status;

}
