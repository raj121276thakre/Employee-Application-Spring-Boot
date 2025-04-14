package com.employee.EmployeeAplicatinSB.service;

import com.employee.EmployeeAplicatinSB.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(
            Arrays.asList(
            new Employee(1, "Raj", "Jejuri"),
            new Employee(2, "Aditya", "Phaltan"),
            new Employee(3, "Kiran", "Nira"),
            new Employee(4, "Saurav", "Yavat")
    )
    );

    //Read
    public List<Employee> getAllEmployees() {

        return employeeList;
    }

    //Read
    public Employee getAnEmployee(int id) {
        return employeeList.stream().filter(e ->
                (e.getEmployeeId() == id)).findFirst().get();
    }

    //Create
    public void createEmployee(Employee employee) {
        employeeList.add(employee);
    }

    //Update
    public void updateEmployee(Employee employee){
        List<Employee> tempEmployee = new ArrayList<>();
        for (Employee emp : employeeList){
            if(emp.getEmployeeId() == employee.getEmployeeId()){
                emp.setEmployeeName(employee.getEmployeeName());
                emp.setEmployeeCity(employee.getEmployeeCity());
            }
            tempEmployee.add(emp);
        }
        this.employeeList = tempEmployee;
    }


    //Delete
    public void deleteEmployee(int id) {
        List<Employee> tempEmployee = new ArrayList<>();
        for (Employee emp : employeeList){
            if(emp.getEmployeeId() == id){
                continue; // if id matches then skip that iteration means didnt adding in templist
            }
            tempEmployee.add(emp);
        }
        this.employeeList = tempEmployee;
    }


}
















