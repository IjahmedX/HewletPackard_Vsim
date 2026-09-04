error id: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/main/java/com/example/restservice/Employee.java:java/lang/String#
file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/main/java/com/example/restservice/Employee.java
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol java/lang/String#
empty definition using fallback
non-local guesses:

offset: 146
uri: file:///C:/Users/ijahm/OneDrive/Documents/Code/Virtual_Experience/hewlet_packard_all/springBoot_take2/rest-service/src/main/java/com/example/restservice/Employee.java
text:
```scala
package com.example.restservice;

public class Employee {

    private String employee_id;
    private String first_name;
    private String@@ last_name;
    private String email;
    private String title;

    public Employee() {
    }

    public Employee(String employee_id,
            String first_name,
            String last_name,
            String email,
            String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    public String getId() {
        return employee_id;
    }

    public void setId(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee: ID = "
                + employee_id + ", First Name = "
                + first_name + ", Last Name = "
                + last_name + ", email = "
                + email + ", title = "
                + title;
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 