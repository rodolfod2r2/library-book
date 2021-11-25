package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long phoneId;
    @Column(name = "phone_type")
    private String phoneType;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "preferred")
    private boolean phonePreferred;
    @Column(name = "status")
    private boolean phoneStatus;

}
