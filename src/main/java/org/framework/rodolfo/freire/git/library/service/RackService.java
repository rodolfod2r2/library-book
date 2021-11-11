package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.Rack;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RackService implements GenericInterfaceService<Rack> {

    @Override
    public List<Rack> findAll() {
        return null;
    }

    @Override
    public Optional<Rack> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Rack save(Rack rack) {
        return null;
    }

    @Override
    public Rack update(Rack rack) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
