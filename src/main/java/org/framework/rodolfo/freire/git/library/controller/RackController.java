package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.RackDto;
import org.framework.rodolfo.freire.git.library.service.RackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rack")
public class RackController implements GenericInterfaceController<RackDto> {

    private final RackService service;

    public RackController(RackService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<RackDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<RackDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<RackDto> save(@RequestBody RackDto rackDto) {
        return new ResponseEntity<>(service.save(rackDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<RackDto> update(@RequestBody RackDto rackDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(rackDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
