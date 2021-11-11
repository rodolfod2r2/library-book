package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements GenericInterfaceService<Employee> {


    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
