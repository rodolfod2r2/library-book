package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.PublishingCompanyDto;
import org.framework.rodolfo.freire.git.library.model.PublishingCompany;
import org.framework.rodolfo.freire.git.library.repository.PublishingCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublishingCompanyService extends PatternConverter<PublishingCompany, PublishingCompanyDto> implements GenericInterfaceService<PublishingCompanyDto> {

    private final PublishingCompanyRepository repository;

    public PublishingCompanyService(PublishingCompanyRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<PublishingCompanyDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, PublishingCompanyDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PublishingCompanyDto getById(Long id) {
        return convertEntityDto(repository.getById(id), PublishingCompanyDto.class);
    }

    @Override
    public PublishingCompanyDto save(PublishingCompanyDto publishingCompanyDto) {
        repository.save(convertDtoEntity(PublishingCompany.class, publishingCompanyDto));
        return publishingCompanyDto;
    }

    @Override
    public PublishingCompanyDto update(PublishingCompanyDto publishingCompanyDto) {
        repository.save(convertDtoEntity(PublishingCompany.class, publishingCompanyDto));
        return publishingCompanyDto;
    }

    @Override
    public void delete(Long id) {

    }
}
