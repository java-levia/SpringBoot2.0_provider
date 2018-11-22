package com.levia.provider.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.levia.provider.domain.Student;
import com.levia.provider.service.StudentService;

@RestController
public class StuController {
	
	@Resource
	private StudentService stuService;
	
	@GetMapping("/findbyid/{id}")
	public Student findById(@PathVariable Integer id) {
		return stuService.getStuById(id);
	}
}
