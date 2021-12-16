package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


//    @Column(name = "code_number")
//    private long codeNumber;
//    @Column(name = "name")
//    private String name;
//    @ManyToMany
//    @JoinColumn(name = "documents_fk")
//    private List<Document> documents;
//    @Column(name = "birthday")
//    private Date birthday;
//    @Column(name = "relationship_date")
//    @Temporal(TemporalType.DATE)
//    private Date relationshipDate;
//    @ManyToMany
//    @JoinColumn(name = "addresses_fk")
//    private List<Address> addresses;
//    @ManyToMany
//    @JoinColumn(name = "phones_fk")
//    private List<Phone> phones;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "password")
//    private String password;
//    @Column(name = "access_level")
//    @Enumerated(EnumType.STRING)
//    private AccessLevel accessLevel;
//    @Column(name = "status")
//    private boolean status;
}
