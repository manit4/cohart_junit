package com.cohart20;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student(String value1, int value2, int value3) {
		
		name = value1;
		age = value2;
		score = value3;
	}
	
	public String checkResult() {
		
		if(score < 40) {
			return "Sorry, you failed";
		}
		else if(score >= 40 && score < 50) {
			return "Passed with Third Class";
		}
		else if(score >= 50 && score < 60) {
			return "Passed with Second Class";
		}
		else if(score >= 60 && score < 70) {
			return "Passed with First Class";
		}
		else {
			return "Distinction";
		}
	}

	public String getName() {
		return name;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
