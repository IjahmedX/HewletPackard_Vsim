package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class EmployeesTest {

    @Test
    public void getEmployeeListTest() {

        Employees employees = new Employees();

        List<Employee> employeeList = employees.getEmployeeList();

        assertThat(employeeList).isNotNull();
    }

    @Test
    public void setEmployeeListTest() {

        Employees employees = new Employees();

        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new Employee(
                "1",
                "First1",
                "Last1",
                "Email1",
                "Title1"
        );

        employeeList.add(employee);

        employees.setEmployeeList(employeeList);

        assertThat(employees.getEmployeeList()).isEqualTo(employeeList);
    }
}
