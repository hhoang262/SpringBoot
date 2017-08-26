package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.taskJira;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface TaskJiraCompany extends CrudRepository<taskJira,Long> {

}
