package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.model.PublishingCompany;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class PublishingCompanyController implements GenericInterfaceController<PublishingCompany> {

    @GetMapping
    @Override
    public ResponseEntity<List<PublishingCompany>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<PublishingCompany>> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @Override
    public ResponseEntity<PublishingCompany> save(@RequestBody PublishingCompany company) {
        return null;
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<PublishingCompany> update(@RequestBody PublishingCompany company, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
