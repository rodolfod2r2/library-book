package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.LegalPersonDto;
import org.framework.rodolfo.freire.git.library.service.LegalPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business")
public class LegalPersonController implements GenericInterfaceController<LegalPersonDto> {

    private final LegalPersonService service;

    public LegalPersonController(LegalPersonService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<LegalPersonDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<LegalPersonDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<LegalPersonDto> save(@RequestBody LegalPersonDto businessDto) {
        return new ResponseEntity<>(service.save(businessDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<LegalPersonDto> update(@RequestBody LegalPersonDto businessDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(businessDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
