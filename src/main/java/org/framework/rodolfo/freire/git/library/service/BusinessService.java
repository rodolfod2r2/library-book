package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.BusinessDto;
import org.framework.rodolfo.freire.git.library.model.Business;
import org.framework.rodolfo.freire.git.library.repository.BusinessRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusinessService extends PatternConverter<Business, BusinessDto> implements GenericInterfaceService<BusinessDto> {

    private final BusinessRepository repository;

    public BusinessService(BusinessRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BusinessDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, BusinessDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public BusinessDto getById(Long id) {
        return convertEntityDto(repository.getById(id), BusinessDto.class);
    }

    @Override
    public BusinessDto save(BusinessDto businessDto) {
        repository.save(convertDtoEntity(Business.class, businessDto));
        return businessDto;
    }

    @Override
    public BusinessDto update(BusinessDto businessDto) {
        repository.save(convertDtoEntity(Business.class, businessDto));
        return businessDto;
    }

    @Override
    public void delete(Long id) {

    }
}
