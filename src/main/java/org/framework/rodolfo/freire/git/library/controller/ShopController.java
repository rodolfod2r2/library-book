package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.model.ShopCar;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shop")
public class ShopController implements GenericInterfaceController<ShopCar> {


    @GetMapping
    @Override
    public ResponseEntity<List<ShopCar>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<ShopCar>> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    @Override
    public ResponseEntity<ShopCar> save(@RequestBody ShopCar shopCar) {
        return null;
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<ShopCar> update(@RequestBody ShopCar shopCar, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id) {

    }

}
