package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController implements GenericInterfaceController<Customer> {

    @GetMapping
    @Override
    public ResponseEntity<List<Customer>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<Customer>> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @Override
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        return null;
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<Customer> update(@RequestBody Customer customer, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
