package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController implements GenericInterfaceController<Book> {

    @GetMapping
    @Override
    public ResponseEntity<List<Book>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<Book>> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @Override
    public ResponseEntity<Book> save(@RequestBody Book book) {
        return null;
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<Book> update(@RequestBody Book book, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
