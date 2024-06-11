package com.tutofox.demo.service.impl;

import com.tutofox.demo.dto.EmployeeDto;
import com.tutofox.demo.entity.Employee;
import com.tutofox.demo.mapper.EmployeeMapper;
import com.tutofox.demo.repository.EmployeeRepository;
import com.tutofox.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
