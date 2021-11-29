package org.framework.rodolfo.freire.git.library.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.model.enums.AccessLevel;
import org.framework.rodolfo.freire.git.library.model.enums.Gender;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "physical_person")
public class PhysicalPerson extends Person {

    @Column(name = "code_number")
    private long codeNumber;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "documents_fk")
    private List<Document> documents;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "relationship_date")
    @Temporal(TemporalType.DATE)
    private Date relationshipDate;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "addresses_fk")
    private List<Address> addresses;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "phones_fk")
    private List<Phone> phones;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "access_level")
    @Enumerated(EnumType.STRING)
    private AccessLevel accessLevel;
    @Column(name = "status")
    private boolean status;

}
