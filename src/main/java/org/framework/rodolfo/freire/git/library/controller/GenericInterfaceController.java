package org.framework.rodolfo.freire.git.library.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GenericInterfaceController<T> {

    ResponseEntity<List<T>> findAll();

    ResponseEntity<T> getById(Long id);

    ResponseEntity<T> save(T t);

    ResponseEntity<T> update(T t, Long id);

    void delete(Long id);

}
