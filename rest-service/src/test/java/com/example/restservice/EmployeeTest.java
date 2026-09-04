package com.example.restservice;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testGetters() {

        Employee employee = new Employee(
                "1",
                "Test",
                "Name",
                "test@email.com",
                "Manager"
        );

        assertThat(employee.getId()).isEqualTo("1");
        assertThat(employee.getFirstName()).isEqualTo("Test");
        assertThat(employee.getLastName()).isEqualTo("Name");
        assertThat(employee.getEmail()).isEqualTo("test@email.com");
        assertThat(employee.getTitle()).isEqualTo("Manager");
    }

    @Test
    public void testSetters() {

        Employee employee = new Employee();

        employee.setId("2");
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setEmail("john@email.com");
        employee.setTitle("Developer");

        assertThat(employee.getId()).isEqualTo("2");
        assertThat(employee.getFirstName()).isEqualTo("John");
        assertThat(employee.getLastName()).isEqualTo("Smith");
        assertThat(employee.getEmail()).isEqualTo("john@email.com");
        assertThat(employee.getTitle()).isEqualTo("Developer");
    }

    @Test
    public void testToString() {

        Employee employee = new Employee(
                "3",
                "Test",
                "Person",
                "test@email.com",
                "Developer"
        );

        String result = employee.toString();

        assertThat(result).contains("3");
        assertThat(result).contains("Test");
        assertThat(result).contains("Person");
        assertThat(result).contains("test@email.com");
        assertThat(result).contains("Developer");
    }
}
