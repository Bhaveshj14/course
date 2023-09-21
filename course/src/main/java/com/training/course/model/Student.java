package com.training.course.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

//@Entity
//@Table(name="STUD")
public class Student {
	
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	private String studName;
	private int age;
//	@Column(name="stud_grade")
	private String grade;
	
	public Student(String studName, int age, String grade){
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}

}
