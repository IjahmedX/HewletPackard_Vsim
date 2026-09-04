error id: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/test/java/com/example/restservice/EmployeeTest.java:com/example/restservice/EmployeeTest#`<init>`().
file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/test/java/com/example/restservice/EmployeeTest.java
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol com/example/restservice/EmployeeTest#`<init>`().
empty definition using fallback
non-local guesses:

offset: 153
uri: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/test/java/com/example/restservice/EmployeeTest.java
text:
```scala
package com.example.restservice;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class EmployeeTest@@ {

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

```


#### Short summary: 

empty definition using pc, found symbol in pc: 