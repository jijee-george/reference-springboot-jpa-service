package com.techNextGen.jpaDemo.mapper;

import com.techNextGen.jpaDemo.dto.EmployeeDTO;
import com.techNextGen.jpaDemo.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDTO(Employee employee){

        return new EmployeeDTO(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getEmail());


    }

    public static Employee mapToEmployee(EmployeeDTO employeeDto){

        return new Employee(employeeDto.getId(),employeeDto.getFirstName(),employeeDto.getLastName(),employeeDto.getEmail());


    }

}
