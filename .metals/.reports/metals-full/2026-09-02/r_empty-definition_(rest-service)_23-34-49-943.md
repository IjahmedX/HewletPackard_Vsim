error id: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/main/java/com/example/restservice/EmployeeAdd.java:com/example/restservice/EmployeeManager#addEmployee#
file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/main/java/com/example/restservice/EmployeeAdd.java
empty definition using pc, found symbol in pc: com/example/restservice/EmployeeManager#addEmployee#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 946
uri: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/main/java/com/example/restservice/EmployeeAdd.java
text:
```scala
package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeAdd {
    
    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping("/employees/add")
    public String addEmployee(@RequestParam String employee_id,
                              @RequestParam String first_name,
                              @RequestParam String last_name,
                              @RequestParam String email,
                              @RequestParam String title) {
        employee Employee = new Employee(employee_id, first_name, last_name, email, title)
        employeeManager.@@addEmployee(employee_id, first_name, last_name, email, title);
        return "Employee added successfully";
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: com/example/restservice/EmployeeManager#addEmployee#