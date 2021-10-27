package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/rack")
    public String rack() {
        return service.findBookByRack();
    }

}
