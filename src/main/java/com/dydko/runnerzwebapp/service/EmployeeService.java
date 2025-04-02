package com.dydko.runnerzwebapp.service;

import com.dydko.runnerzwebapp.model.Employee;
import com.dydko.runnerzwebapp.model.EmployeePage;
import com.dydko.runnerzwebapp.model.EmployeeSearchCriteria;
import com.dydko.runnerzwebapp.repository.EmployeeCriteriaRepository;
import com.dydko.runnerzwebapp.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria) {
        return employeeCriteriaRepository.findAllWithFilter(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
