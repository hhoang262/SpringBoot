package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.taskJira;
import com.example.demo.repository.TaskJiraCompany;

@RestController
public class TaskJiraCompanyController {
	@Autowired
	TaskJiraCompany taskJiraCompany;

	@RequestMapping(value = "/task/getAll")
	public ResponseEntity<?> getAll() {

		List<taskJira> task = (List<taskJira>) taskJiraCompany.findAll();
		return ResponseEntity.ok(task);

	}

	@RequestMapping(value = "task/model")
	public ResponseEntity<?> getModel() {
		taskJira task = new taskJira();
		return ResponseEntity.ok(task);
	}
}
