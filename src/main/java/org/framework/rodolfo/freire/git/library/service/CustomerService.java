package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements GenericInterfaceService<Customer> {


    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
