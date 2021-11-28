package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.CustomerDto;
import org.framework.rodolfo.freire.git.library.model.Customer;
import org.framework.rodolfo.freire.git.library.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService extends PatternConverter<Customer, CustomerDto> implements GenericInterfaceService<CustomerDto> {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CustomerDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, CustomerDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto getById(Long id) {
        return convertEntityDto(repository.getById(id), CustomerDto.class);
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        repository.save(convertDtoEntity(Customer.class, customerDto));
        return customerDto;
    }

    @Override
    public CustomerDto update(CustomerDto customerDto) {
        repository.save(convertDtoEntity(Customer.class, customerDto));
        return customerDto;
    }

    @Override
    public void delete(Long id) {

    }
}
