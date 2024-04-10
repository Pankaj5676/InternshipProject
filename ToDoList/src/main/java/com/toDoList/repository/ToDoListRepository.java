package com.toDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toDoList.entity.TaskDetails;

@Repository
public interface ToDoListRepository extends JpaRepository<TaskDetails, Integer>  {

}
