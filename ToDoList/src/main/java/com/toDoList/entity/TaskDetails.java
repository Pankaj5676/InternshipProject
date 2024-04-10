package com.toDoList.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskDetails {
	public TaskDetails(int iD, String task, String description, String day) {
		super();
		ID = iD;
		Task = task;
		Description = description;
		Day = day;
	}
	
	public TaskDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private String Task;
	private String Description;
	private String Day;
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTask() {
		return Task;
	}

	public void setTask(String task) {
		Task = task;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		Day = day;
	}

	
	
	
	
}
