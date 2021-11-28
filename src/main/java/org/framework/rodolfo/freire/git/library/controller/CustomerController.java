package org.framework.rodolfo.freire.git.library.controller;

import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.dto.CustomerDto;
import org.framework.rodolfo.freire.git.library.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController implements GenericInterfaceController<CustomerDto> {

    final
    CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<CustomerDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<CustomerDto> save(@RequestBody CustomerDto customerDto) {
        return new ResponseEntity<>(service.save(customerDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<CustomerDto> update(@RequestBody CustomerDto customerDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(customerDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
