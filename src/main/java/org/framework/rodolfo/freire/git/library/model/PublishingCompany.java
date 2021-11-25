package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "publishing_company")
public class PublishingCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinColumn(name = "addresses_fk")
    private List<Address> addresses;
    @ManyToMany
    @JoinColumn(name = "phones_fk")
    private List<Phone> phones;
    @Column(name = "email")
    private String email;

}
