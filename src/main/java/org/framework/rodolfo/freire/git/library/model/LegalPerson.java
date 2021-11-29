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
@Table(name = "legal_person")
public class LegalPerson extends Person {

    @Column(name = "fantasy_name")
    private String fantasyName;
    @Column(name = "corporate_name")
    private String corporateName;
    @Column(name = "foundation_date")
    private Date foundationDate;
    @Column(name = "economic_activity")
    private String economicActivity;
    @Column(name = "number_employees")
    private Long numberOfEmployees;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "occupation")
    private String occupation;

    @Column(name = "code_number")
    private long codeNumber;
    @ManyToMany
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
    @ManyToMany
    @JoinColumn(name = "addresses_fk")
    private List<Address> addresses;
    @ManyToMany
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
