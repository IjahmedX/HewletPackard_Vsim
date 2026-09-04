error id: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/test/java/com/example/restservice/EmployeeManagerTest.java:_empty_/employees#
file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/test/java/com/example/restservice/EmployeeManagerTest.java
empty definition using pc, found symbol in pc: _empty_/employees#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 632
uri: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/test/java/com/example/restservice/EmployeeManagerTest.java
text:
```scala
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
        assert emplo@@yees.getEmployeeList().size() == 4;
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/employees#