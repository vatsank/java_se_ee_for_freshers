package com.training.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import com.training.UsingAnnotations;

public class AnnotationProcessor {

	public static Logger log = Logger.getAnonymousLogger();
	
	public static void main(String[] args) {
		
		// Create a Instance of a class whose elements are  annotated
		
		UsingAnnotations secondUse = new UsingAnnotations();
		
		System.out.println(secondUse.showMessge());
		
	Class<?>  clsReference = secondUse.getClass();
		
		try {
		
			Method  annotatedMethod = clsReference.getMethod("showMessge");
			
			Annotation[] list = annotatedMethod.getAnnotations();

			for(Annotation eachAnnotation : list) {
				
				 if(eachAnnotation instanceof Data) {
					  
					 Data data = (Data)eachAnnotation;
					 System.out.println(data.info());
				 }
				 
				 if(eachAnnotation instanceof MyAnnotation) {
					 
					 MyAnnotation anno = (MyAnnotation)eachAnnotation;
					 System.out.println(anno.message());
				 }
			}
		
		} catch (NoSuchMethodException  | SecurityException e2) {
	      		e2.printStackTrace();
		}	
		     	
  }
}
