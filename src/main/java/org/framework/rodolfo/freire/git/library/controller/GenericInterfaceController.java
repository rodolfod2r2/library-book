package org.framework.rodolfo.freire.git.library.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface GenericInterfaceController<T> {

    ResponseEntity<List<T>> findAll();

    ResponseEntity<Optional<T>> findById(Long id);

    ResponseEntity<T> save(T t);

    ResponseEntity<T> update(T t, Long id);

    void delete(Long id);

}
