package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.model.Rack;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rack")
public class RackController implements GenericInterfaceController<Rack> {

    @GetMapping
    @Override
    public ResponseEntity<List<Rack>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<Rack>> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @Override
    public ResponseEntity<Rack> save(@RequestBody Rack rack) {
        return null;
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<Rack> update(@RequestBody Rack rack, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
