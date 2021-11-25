package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.Business;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessService implements GenericInterfaceService<Business> {


    @Override
    public List<Business> findAll() {
        return null;
    }

    @Override
    public Optional<Business> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Business save(Business business) {
        return null;
    }

    @Override
    public Business update(Business business) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
