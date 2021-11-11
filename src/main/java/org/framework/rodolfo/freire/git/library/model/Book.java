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
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long bookId;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_author")
    private List<String> bookAuthor;
    @Column(name = "book_category")
    private List<BookCategory> bookCategory;
    @Column(name = "book_edition")
    private String bookEdition;
    @Column(name = "book_quantity")
    private int bookQuantity;
    @Column(name = "book_category")
    private boolean bookStatus;

}
