package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.BookDto;
import org.framework.rodolfo.freire.git.library.model.Book;
import org.framework.rodolfo.freire.git.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService extends PatternConverter<Book, BookDto> implements GenericInterfaceService<BookDto> {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BookDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, BookDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public BookDto getById(Long id) {
        return convertEntityDto(repository.getById(id), BookDto.class);
    }

    @Override
    public BookDto save(BookDto bookDto) {
        repository.save(convertDtoEntity(Book.class, bookDto));
        return bookDto;
    }

    @Override
    public BookDto update(BookDto bookDto) {
        repository.save(convertDtoEntity(Book.class, bookDto));
        return bookDto;
    }

    @Override
    public void delete(Long id) {

    }
}
