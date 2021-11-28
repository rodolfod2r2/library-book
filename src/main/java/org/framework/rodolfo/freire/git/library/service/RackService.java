package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.RackDto;
import org.framework.rodolfo.freire.git.library.model.Rack;
import org.framework.rodolfo.freire.git.library.repository.RackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RackService extends PatternConverter<Rack, RackDto> implements GenericInterfaceService<RackDto> {

    private final RackRepository repository;

    public RackService(RackRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RackDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, RackDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public RackDto getById(Long id) {
        return convertEntityDto(repository.getById(id), RackDto.class);
    }

    @Override
    public RackDto save(RackDto rackDto) {
        repository.save(convertDtoEntity(Rack.class, rackDto));
        return rackDto;
    }

    @Override
    public RackDto update(RackDto rackDto) {
        repository.save(convertDtoEntity(Rack.class, rackDto));
        return rackDto;
    }

    @Override
    public void delete(Long id) {

    }
}
