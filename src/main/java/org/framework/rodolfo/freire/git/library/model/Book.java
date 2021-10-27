package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    private String bookName;
    private List<String> bookAuthor;
    private List<String> bookCategory;
    private String bookEdition;
    private int bookQuantity;
    private boolean bookStatus;

}
