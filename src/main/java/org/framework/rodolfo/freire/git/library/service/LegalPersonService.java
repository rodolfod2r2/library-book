package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.LegalPersonDto;
import org.framework.rodolfo.freire.git.library.model.LegalPerson;
import org.framework.rodolfo.freire.git.library.repository.LegalPersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LegalPersonService extends PatternConverter<LegalPerson, LegalPersonDto> implements GenericInterfaceService<LegalPersonDto> {

    private final LegalPersonRepository repository;

    public LegalPersonService(LegalPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<LegalPersonDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, LegalPersonDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public LegalPersonDto getById(Long id) {
        return convertEntityDto(repository.getById(id), LegalPersonDto.class);
    }

    @Override
    public LegalPersonDto save(LegalPersonDto businessDto) {
        repository.save(convertDtoEntity(LegalPerson.class, businessDto));
        return businessDto;
    }

    @Override
    public LegalPersonDto update(LegalPersonDto businessDto) {
        repository.save(convertDtoEntity(LegalPerson.class, businessDto));
        return businessDto;
    }

    @Override
    public void delete(Long id) {

    }
}
