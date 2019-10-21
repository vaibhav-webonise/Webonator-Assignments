package com.webonise.springBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webonise.springBootDemo.dao.EmployeeRepo;
import com.webonise.springBootDemo.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		return modelAndView;
	}

	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		employeeRepo.save(employee);
		return "showData.jsp";
	}

	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int employeeId) {
		ModelAndView modelAndView = new ModelAndView("showData.jsp");
		Employee employee = (Employee) employeeRepo.findById(employeeId).orElse(null);
		modelAndView.addObject(employee);
		return modelAndView;
	}

	@RequestMapping("/editEmployee")
	public ModelAndView editEmployee(@RequestParam int employeeId) {
		ModelAndView modelAndView = new ModelAndView("editData.jsp");
		Employee employee = (Employee) employeeRepo.findById(employeeId).orElse(null);
		modelAndView.addObject(employee);
		return modelAndView;

	}

	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@RequestParam int employeeId) {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		employeeRepo.deleteById(employeeId);
		return modelAndView;
	}
}
