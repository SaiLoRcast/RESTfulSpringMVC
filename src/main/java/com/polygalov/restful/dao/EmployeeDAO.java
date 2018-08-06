package com.polygalov.restful.dao;

import com.polygalov.restful.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeDAO {

    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Employee emp1 = new Employee("01", "John", "Clerk");
        Employee emp2 = new Employee("02", "Pitooh", "Avtovoz");
        Employee emp3 = new Employee("03", "Vonyachii", "Trrrrrrrrrrrrrrrrrrrrrrrrri");

        empMap.put(emp1.getNumber(), emp1);
        empMap.put(emp2.getNumber(), emp2);
        empMap.put(emp3.getNumber(), emp3);
    }

    public Employee getEmployee(String number) {
        return empMap.get(number);
    }

    public Employee addEmployee(Employee employee) {
        empMap.put(employee.getNumber(), employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee) {
        empMap.put(employee.getNumber(), employee);
        return employee;
    }

    public void deleteEmployee(String number) {
        empMap.remove(number);
    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> collection = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(collection);
        return list;
    }
}

