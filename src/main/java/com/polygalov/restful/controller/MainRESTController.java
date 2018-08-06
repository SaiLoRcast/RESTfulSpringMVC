package com.polygalov.restful.controller;

import com.polygalov.restful.dao.EmployeeDAO;
import com.polygalov.restful.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainRESTController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to REST template example";
    }

    //URL
    //http://localhost:8080/RESTfulSpringMVC/employees
    @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> list = employeeDAO.getAllEmployees();
        return list;
    }

    //URL
    //http://localhost:8080/RESTfulSpringMVC/employee/{number}
    @RequestMapping(value = "/employee/{number}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Employee getEmployee(@PathVariable("number") String number) {
        return employeeDAO.getEmployee(number);
    }
}
