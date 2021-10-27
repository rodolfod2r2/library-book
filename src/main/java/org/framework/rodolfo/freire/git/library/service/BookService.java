package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.component.SearchBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    SearchBook search;

    public String findBookByRack() {
        return search.findBookByRack();
    }

}
