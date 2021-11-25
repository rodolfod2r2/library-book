package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.PublishingCompany;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublishingCompanyService implements GenericInterfaceService<PublishingCompany> {


    @Override
    public List<PublishingCompany> findAll() {
        return null;
    }

    @Override
    public Optional<PublishingCompany> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public PublishingCompany save(PublishingCompany company) {
        return null;
    }

    @Override
    public PublishingCompany update(PublishingCompany company) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
