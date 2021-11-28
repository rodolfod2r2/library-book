package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.BusinessDto;
import org.framework.rodolfo.freire.git.library.service.BusinessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessController implements GenericInterfaceController<BusinessDto> {

    private final BusinessService service;

    public BusinessController(BusinessService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<BusinessDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<BusinessDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<BusinessDto> save(@RequestBody BusinessDto businessDto) {
        return new ResponseEntity<>(service.save(businessDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<BusinessDto> update(@RequestBody BusinessDto businessDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(businessDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
