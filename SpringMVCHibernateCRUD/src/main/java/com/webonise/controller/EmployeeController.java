package com.webonise.controller;

import com.webonise.model.Employee;
import com.webonise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String listEmployees(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("listEmployees", employeeService.listEmployees());
        return "employee";
    }

    @RequestMapping(value = "/employee/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("employee") Employee employee) {
        if (employee.getId() == 0) {
            employeeService.addEmployee(employee);
        } else {
            employeeService.updateEmployee(employee);
        }
        return "redirect:/employees";
    }

    @RequestMapping("/remove/{id}")
    public String removeEmployee(@PathVariable("id") int id) {
        this.employeeService.removeEmployee(id);
        return "redirect:/employees";
    }

    @RequestMapping("/edit/{id}")
    public String editEmployee(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        model.addAttribute("listEmployees", employeeService.listEmployees());
        return "employee";
    }
}
