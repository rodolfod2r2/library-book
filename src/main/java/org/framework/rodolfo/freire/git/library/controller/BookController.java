package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.BookDto;
import org.framework.rodolfo.freire.git.library.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController implements GenericInterfaceController<BookDto> {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<BookDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<BookDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<BookDto> save(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(service.save(bookDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<BookDto> update(@RequestBody BookDto bookDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(bookDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
