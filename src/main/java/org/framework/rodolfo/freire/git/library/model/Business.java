package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "business")
public class Business extends Person {

    @Column(name = "corporate_name")
    private String corporateName;
    @Column(name = "foundation_date")
    private Date foundationDate;
    @Column(name = "economic_activity")
    private String economicActivity;
    @Column(name = "number_employees")
    private Long numberOfEmployees;
    @Column(name = "contact")
    private String contact;
    @Column(name = "occupation")
    private String occupation;


}
