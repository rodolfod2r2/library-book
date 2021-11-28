package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.PublishingCompanyDto;
import org.framework.rodolfo.freire.git.library.service.PublishingCompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class PublishingCompanyController implements GenericInterfaceController<PublishingCompanyDto> {

    private final PublishingCompanyService service;

    public PublishingCompanyController(PublishingCompanyService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<PublishingCompanyDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<PublishingCompanyDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    @Override
    public ResponseEntity<PublishingCompanyDto> save(@RequestBody PublishingCompanyDto companyDto) {
        return new ResponseEntity<>(service.save(companyDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<PublishingCompanyDto> update(@RequestBody PublishingCompanyDto companyDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(companyDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }
}
