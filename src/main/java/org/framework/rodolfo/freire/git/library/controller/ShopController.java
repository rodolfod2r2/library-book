package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.dto.ShopCarDto;
import org.framework.rodolfo.freire.git.library.service.ShopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController implements GenericInterfaceController<ShopCarDto> {

    private final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ShopCarDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShopCarDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<ShopCarDto> save(@RequestBody ShopCarDto shopCarDto) {
        return new ResponseEntity<>(service.save(shopCarDto), HttpStatus.FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShopCarDto> update(@RequestBody ShopCarDto shopCarDto, @PathVariable Long id) {
        return new ResponseEntity<>(service.save(shopCarDto), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

    }

}
