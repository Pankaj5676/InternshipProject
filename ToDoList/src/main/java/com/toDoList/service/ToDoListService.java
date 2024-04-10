package com.toDoList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDoList.entity.TaskDetails;
import com.toDoList.repository.ToDoListRepository;

@Service
public class ToDoListService {

	@Autowired
	private ToDoListRepository tdrepo;
	
	public void save(TaskDetails tdet) {
		tdrepo.save(tdet);		
	}
	public List<TaskDetails> getAllTask(){
		return tdrepo.findAll();
	}
	
	public void deleteById(int ID) {
		tdrepo.deleteById(ID);
	}
	
}
