package com.levia.provider.domain;

public class Student {
	private int id;
	
	public Student(int id, String name, int age, String school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.school = school;
	}

	private String name;
	
	private int age;
	
	private String school;

	public String getName() {
		return name;
	}

	public Student() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
