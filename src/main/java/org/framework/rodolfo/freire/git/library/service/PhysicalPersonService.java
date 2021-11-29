package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.PhysicalPersonDto;
import org.framework.rodolfo.freire.git.library.model.PhysicalPerson;
import org.framework.rodolfo.freire.git.library.repository.PhysicalPersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhysicalPersonService extends PatternConverter<PhysicalPerson, PhysicalPersonDto> implements GenericInterfaceService<PhysicalPersonDto> {

    private final PhysicalPersonRepository repository;

    public PhysicalPersonService(PhysicalPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PhysicalPersonDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, PhysicalPersonDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PhysicalPersonDto getById(Long id) {
        return convertEntityDto(repository.getById(id), PhysicalPersonDto.class);
    }

    @Override
    public PhysicalPersonDto save(PhysicalPersonDto customerDto) {
        repository.save(convertDtoEntity(PhysicalPerson.class, customerDto));
        return customerDto;
    }

    @Override
    public PhysicalPersonDto update(PhysicalPersonDto customerDto) {
        repository.save(convertDtoEntity(PhysicalPerson.class, customerDto));
        return customerDto;
    }

    @Override
    public void delete(Long id) {

    }
}
