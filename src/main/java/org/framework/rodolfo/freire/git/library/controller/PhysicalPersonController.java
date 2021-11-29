package org.framework.rodolfo.freire.git.library.controller;

import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.dto.PhysicalPersonDto;
import org.framework.rodolfo.freire.git.library.service.PhysicalPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/customer")
public class PhysicalPersonController implements GenericInterfaceController<PhysicalPersonDto> {

    final
    PhysicalPersonService service;

    public PhysicalPersonController(PhysicalPersonService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<PhysicalPersonDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhysicalPersonDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<PhysicalPersonDto> save(@RequestBody PhysicalPersonDto physicalPersonDto) {
        return new ResponseEntity<>(service.save(physicalPersonDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<PhysicalPersonDto> update(@RequestBody PhysicalPersonDto physicalPersonDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(physicalPersonDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
