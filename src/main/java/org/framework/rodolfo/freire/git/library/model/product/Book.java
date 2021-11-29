package org.framework.rodolfo.freire.git.library.model.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.model.Author;
import org.framework.rodolfo.freire.git.library.model.BookCategory;
import org.framework.rodolfo.freire.git.library.model.PublishingCompany;

import javax.persistence.*;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinColumn(name = "authors_fk")
    private List<Author> authors;
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory;
    @Column(name = "edition")
    private String edition;
    @ManyToOne
    @JoinColumn(name = "publish_company_fk")
    private PublishingCompany publishingCompany;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "status")
    private boolean status;

}
