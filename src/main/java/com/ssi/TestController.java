package com.ssi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("course")
public class TestController {
	
	@Autowired
	private CourseJpaRepository repository;
	
	@GetMapping(produces="application/json")
	public Iterable<Course> getAllCourses(){
		return repository.findAll();
	}
	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
}
