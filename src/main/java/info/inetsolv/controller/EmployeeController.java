package info.inetsolv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.inetsolv.entity.Employee;

@Controller
@RequestMapping(path="/")
public class EmployeeController {

	@RequestMapping(method=RequestMethod.GET)
	public String displayForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "emp";
	}
	
	
}
