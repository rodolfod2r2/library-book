package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements GenericInterfaceController<Employee> {

    @GetMapping
    @Override
    public ResponseEntity<List<Employee>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<Employee>> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @Override
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return null;
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<Employee> update(@RequestBody Employee employee, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }

}
