package com.levia.provider.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.levia.provider.domain.Student;

@Service
public class StudentService {
	
	private Map stuMap=new HashMap();
	
	public Student getStuById(Integer id) {
		stuMap.put(1, new Student(1,"诸葛",20,"huke"));
		stuMap.put(2, new Student(2,"刘备",21,"huda"));
		stuMap.put(3, new Student(3,"关羽",22,"zhongnan"));
		return (Student)stuMap.get(id);
	}
}
