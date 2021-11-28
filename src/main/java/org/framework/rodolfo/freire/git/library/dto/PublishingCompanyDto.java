package org.framework.rodolfo.freire.git.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.model.Address;
import org.framework.rodolfo.freire.git.library.model.Phone;

import java.util.List;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PublishingCompanyDto {

    private long id;
    private String name;
    private List<Address> addresses;
    private List<Phone> phones;
    private String email;

}
