package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.ProductDto;
import org.framework.rodolfo.freire.git.library.model.product.Product;
import org.framework.rodolfo.freire.git.library.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService extends PatternConverter<Product, ProductDto> implements GenericInterfaceService<ProductDto> {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto getById(Long id) {
        return convertEntityDto(repository.getById(id), ProductDto.class);
    }

    @Override
    public ProductDto save(ProductDto bookDto) {
        repository.save(convertDtoEntity(Product.class, bookDto));
        return bookDto;
    }

    @Override
    public ProductDto update(ProductDto bookDto) {
        repository.save(convertDtoEntity(Product.class, bookDto));
        return bookDto;
    }

    @Override
    public void delete(Long id) {

    }
}
