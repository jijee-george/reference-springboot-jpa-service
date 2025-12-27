package com.techNextGen.jpaDemo.service.impl;

import com.techNextGen.jpaDemo.dto.EmployeeDTO;
import com.techNextGen.jpaDemo.entity.Employee;
import com.techNextGen.jpaDemo.mapper.EmployeeMapper;
import com.techNextGen.jpaDemo.repository.EmployeeRepository;
import com.techNextGen.jpaDemo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;



    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee employeeSaved = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDTO(employeeSaved);
    }
}
