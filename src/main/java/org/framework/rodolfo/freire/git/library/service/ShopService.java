package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.ShopCarDto;
import org.framework.rodolfo.freire.git.library.model.ShopCar;
import org.framework.rodolfo.freire.git.library.repository.ShopCarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShopService extends PatternConverter<ShopCar, ShopCarDto> implements GenericInterfaceService<ShopCarDto> {

    private final ShopCarRepository repository;

    public ShopService(ShopCarRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ShopCarDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, ShopCarDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ShopCarDto getById(Long id) {
        return convertEntityDto(repository.getById(id), ShopCarDto.class);
    }

    @Override
    public ShopCarDto save(ShopCarDto shopCarDto) {
        repository.save(convertDtoEntity(ShopCar.class, shopCarDto));
        return shopCarDto;
    }

    @Override
    public ShopCarDto update(ShopCarDto shopCarDto) {
        repository.save(convertDtoEntity(ShopCar.class, shopCarDto));
        return shopCarDto;
    }

    @Override
    public void delete(Long id) {

    }
}
