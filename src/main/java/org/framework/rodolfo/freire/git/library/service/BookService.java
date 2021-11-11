package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements GenericInterfaceService<Book> {


    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
