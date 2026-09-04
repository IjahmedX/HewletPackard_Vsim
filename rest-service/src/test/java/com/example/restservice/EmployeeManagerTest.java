package com.example.restservice;

import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {

    @Test
    public void testGetAllEmployees() {

        EmployeeManager EmployeeTest = new EmployeeManager();
        Employees employees = EmployeeTest.getAllEmployees();
        assert employees.getEmployeeList().size() == 3;

    }

    public void testAddEmployees() {

        EmployeeManager EmployeeTest = new EmployeeManager();
        Employee employee = new Employee("4", "Employee4", "Employee4", "Employee@example.com", "Mr");
        EmployeeTest.addEmployee(employee);
        Employees employees = EmployeeTest.getAllEmployees();
        assert employees.getEmployeeList().size() == 3;
    }
}
