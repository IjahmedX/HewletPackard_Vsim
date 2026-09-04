package com.example.restservice;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private EmployeeManager employeeManager;

    @Test
    public void getEmployeesTest() throws Exception {

        Employees employees = new Employees();

        employees.getEmployeeList().add(
                new Employee("1", "First1", "Last1", "Email1", "Title1"));

        employees.getEmployeeList().add(
                new Employee("2", "First2", "Last2", "Email2", "Title2"));

        employees.getEmployeeList().add(
                new Employee("3", "First3", "Last3", "Email3", "Title3"));

        when(employeeManager.getAllEmployees()).thenReturn(employees);

        mockMvc.perform(get("/employees")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeList", hasSize(3)))
                .andExpect(jsonPath("$.employeeList[0].first_name", is("First1")));
    }

    @Test
    public void addEmployeeTest() throws Exception {

        Employee employee = new Employee("4", "First4", "Last4", "Email4", "Mr");

        mockMvc.perform(
                org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":\"4\",\"first_name\":\"First4\",\"last_name\":\"Last4\",\"email\":\"Email4\",\"title\":\"Mr\"}"))
                .andExpect(status().isCreated());
    }
}
