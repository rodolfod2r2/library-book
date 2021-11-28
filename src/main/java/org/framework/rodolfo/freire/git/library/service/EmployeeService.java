package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.converter.PatternConverter;
import org.framework.rodolfo.freire.git.library.dto.EmployeeDto;
import org.framework.rodolfo.freire.git.library.model.Employee;
import org.framework.rodolfo.freire.git.library.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService extends PatternConverter<Employee, EmployeeDto> implements GenericInterfaceService<EmployeeDto> {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<EmployeeDto> findAll() {
        return repository.findAll()
                .stream()
                .map(obj -> convertEntityDto(obj, EmployeeDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getById(Long id) {
        return convertEntityDto(repository.getById(id), EmployeeDto.class);
    }

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        repository.save(convertDtoEntity(Employee.class, employeeDto));
        return employeeDto;
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        repository.save(convertDtoEntity(Employee.class, employeeDto));
        return employeeDto;
    }

    @Override
    public void delete(Long id) {

    }
}
