package com.training;

import java.lang.reflect.Method;

import com.training.utils.*;

public class UsingAnnotations {

	@MyAnnotation(message = "Hello India")
	private String msg;
	
	
	@MyAnnotation(message = "Hello Nagpur")
	@Data(info = "One more annotation")
	public String showMessge() {
		
	String message = "hello world";
	
Class<?>  clsReference = this.getClass();
		
		try {
			
			Method  annotatedMethod = clsReference.getMethod("showMessge");
			
			MyAnnotation annotation = annotatedMethod.getAnnotation(MyAnnotation.class);

			   message = annotation.message();
		
		} catch (NoSuchMethodException  | SecurityException e2) {
	      		e2.printStackTrace();
		}	
		return message;
	}
}
