package com.toDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.toDoList.entity.TaskDetails;
import com.toDoList.service.ToDoListService;


@Controller
public class TaskController {

	@Autowired
	private ToDoListService tdService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/about_Us")
	public String aboutUs() {
		return "aboutUs";
	}
	
	@GetMapping("/New_task")
	public String addTask() {
		return "addTask";
	}
	
	@GetMapping("/Pending_Task")
	public ModelAndView allTask() {
		List<TaskDetails> list =tdService.getAllTask();
		
		  ModelAndView m=new ModelAndView();
		  m.setViewName("allTask");
		  m.addObject("task",list); 
		  return m;
		
	///	new ModelAndView("allTask","task","list")
	}
	
	@PostMapping("/save")
	public String addTask(@ModelAttribute TaskDetails tdet) {
        tdService.save(tdet);		
		return "redirect:/Pending_Task";
	}
	
	@RequestMapping("/deleteTask/{ID}")
	public String deleteTask(@PathVariable("ID") int ID) {
		
		tdService.deleteById(ID);
		
		return "redirect:/Pending_Task";
		
	}
	
}
