package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer extends Person {

    @OneToOne
    private LegalPerson legalPerson;
    @OneToOne
    private PhysicalPerson physicalPerson;

}
