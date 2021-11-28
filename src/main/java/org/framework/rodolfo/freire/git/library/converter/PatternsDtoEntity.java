package org.framework.rodolfo.freire.git.library.converter;

public interface PatternsDtoEntity<E, T> {
    T convertEntityDto(E entity, Class<T> tClass);

    E convertDtoEntity(Class<E> eClass, T dto);
}
