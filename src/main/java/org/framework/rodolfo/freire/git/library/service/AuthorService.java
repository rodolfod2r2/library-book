package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.AuthorDto;
import org.framework.rodolfo.freire.git.library.model.Author;
import org.framework.rodolfo.freire.git.library.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService extends PatternConverter<Author, AuthorDto> implements GenericInterfaceService<AuthorDto> {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AuthorDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, AuthorDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public AuthorDto getById(Long id) {
        return convertEntityDto(repository.getById(id), AuthorDto.class);
    }

    @Override
    public AuthorDto save(AuthorDto authorDto) {
        repository.save(convertDtoEntity(Author.class, authorDto));
        return authorDto;
    }

    @Override
    public AuthorDto update(AuthorDto authorDto) {
        repository.save(convertDtoEntity(Author.class, authorDto));
        return authorDto;
    }

    @Override
    public void delete(Long id) {

    }
}
