package com.employee.EmployeeAplicatinSB.controller;

import com.employee.EmployeeAplicatinSB.entity.Employee;
import com.employee.EmployeeAplicatinSB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//@RestController  //@RestController = @ResponseBody + @Controller
@ResponseBody
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //    get all employees
    // GetMapping("/employees")
    @RequestMapping("/employees")
    public List<Employee> findAllEmployee() {
        return employeeService.getAllEmployees();
    }

    //    get single employee
   // GetMapping("/employees/{id}")
    @RequestMapping("/employees/{id}")
    public Employee finaAnEmployee(@PathVariable int id) {
        return employeeService.getAnEmployee(id);
    }

    //@PostMapping("/employees")
    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public void createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

   // @PutMapping("/employees/{id}")
   @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

//    @DeleteMapping
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    public List<Employee> deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return employeeService.getAllEmployees();
    }

}













