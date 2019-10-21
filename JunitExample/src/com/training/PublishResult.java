package com.training;

public class PublishResult {

	
	public String findGrade(double mark) {
		
		String grade = "O";
		
		if(mark<=30 ) {
			grade = "D";
		} else if(mark >30 && mark <60) {
			grade = "C";
		} else if(mark>60 && mark <90) {
			grade = "B";
		} else {
			
			grade ="A";
		}
		
		return grade;
	}
}
