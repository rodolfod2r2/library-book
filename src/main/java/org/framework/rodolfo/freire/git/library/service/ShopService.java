package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.ShopCar;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService implements GenericInterfaceService<ShopCar> {

    @Override
    public List<ShopCar> findAll() {
        return null;
    }

    @Override
    public Optional<ShopCar> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public ShopCar save(ShopCar shopCar) {
        return null;
    }

    @Override
    public ShopCar update(ShopCar shopCar) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
