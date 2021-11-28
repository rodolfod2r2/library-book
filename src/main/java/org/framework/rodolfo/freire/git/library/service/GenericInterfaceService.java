package org.framework.rodolfo.freire.git.library.service;

import java.util.List;

public interface GenericInterfaceService<T> {

    List<T> findAll();

    T getById(Long id);

    T save(T t);

    T update(T t);

    void delete(Long id);

}
