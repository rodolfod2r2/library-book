package org.framework.rodolfo.freire.git.library.converter;

import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;

@NoArgsConstructor
public class PatternConverter<E, T> implements PatternsDtoEntity<E, T> {

    @Override
    public T convertEntityDto(E entity, Class<T> tClass) {
        return new ModelMapper().map(entity, (Type) tClass);
    }

    @Override
    public E convertDtoEntity(Class<E> eClass, T dto) {
        return new ModelMapper().map(dto, (Type) eClass);
    }

}