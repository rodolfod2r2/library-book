package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.EmployeeDto;
import org.framework.rodolfo.freire.git.library.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController implements GenericInterfaceController<EmployeeDto> {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<EmployeeDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<EmployeeDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(service.save(employeeDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<EmployeeDto> update(@RequestBody EmployeeDto employeeDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(employeeDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }

}
