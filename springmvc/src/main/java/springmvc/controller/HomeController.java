package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("first")
public class HomeController {

	// seding data form controller to view with the help of model
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("this is home url");
		model.addAttribute("name","Sanjay Barman");
		model.addAttribute("id",1243);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Sahil");
		friends.add("Vishwajeet");
		friends.add("Sujeet");
		friends.add("Ritesh");
		friends.add("Rachit");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
	}
	
	
	// sending data controller to view with the help of ModelAndView
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		// seting the data
		modelAndView.addObject("name","Uttam Sukla");
		modelAndView.addObject("rollnumber",12455);
		modelAndView.setViewName("help");   			// seting  view name
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		return modelAndView;
	}
}




/*
  five step need to follow spring mvc application creation steps
  
  1) Configure the dispatcher servlet in web.xml
  2) Create Spring Configaration File
  3) Configure View Resolver
  4) Create Controller
  5) Create a view to show(page)


*/