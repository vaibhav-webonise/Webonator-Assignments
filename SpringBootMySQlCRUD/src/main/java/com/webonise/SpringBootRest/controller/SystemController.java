package com.webonise.SpringBootRest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.webonise.SpringBootRest.dao.SystemRepository;
import com.webonise.SpringBootRest.model.ISystem;

@Controller
public class SystemController {
	@Autowired
	SystemRepository systemRepository;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		List<ISystem> systems=(List)systemRepository.findAll();
		modelAndView.addObject("systems",systems);
		return modelAndView;
	}	
	
	@RequestMapping("addData")
	public ModelAndView addData(ISystem iSystem){
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		systemRepository.save(iSystem);
		List<ISystem> systems=(List)systemRepository.findAll();
		modelAndView.addObject("systems",systems);
		return modelAndView;
	}
	
	@RequestMapping("deleteData")
	public ModelAndView deleteData(@RequestParam int systemId) {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		systemRepository.deleteById(systemId);
		List<ISystem> systems=(List)systemRepository.findAll();
		modelAndView.addObject("systems",systems);
		return modelAndView;
	}
	
	@RequestMapping("editData")
	public ModelAndView editData(@RequestParam int systemId) {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		ISystem iSystem=systemRepository.findById(systemId).orElse(null);
		modelAndView.addObject("system",iSystem);
		List<ISystem> systems=(List)systemRepository.findAll();
		modelAndView.addObject("systems",systems);
		return modelAndView;
	}
}
