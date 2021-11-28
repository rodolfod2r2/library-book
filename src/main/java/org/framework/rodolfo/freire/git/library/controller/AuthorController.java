package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.AuthorDto;
import org.framework.rodolfo.freire.git.library.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController implements GenericInterfaceController<AuthorDto> {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<AuthorDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<AuthorDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<AuthorDto> save(@RequestBody AuthorDto authorDto) {
        return new ResponseEntity<>(service.save(authorDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<AuthorDto> update(@RequestBody AuthorDto authorDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(authorDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
