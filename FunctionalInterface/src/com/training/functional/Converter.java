package com.training.functional;

import java.util.function.Predicate;

@FunctionalInterface
public interface Converter<T,R> {

	public R convert(T frm);
	
	
	
}


// interface ConverterWithOutGeneric {
//
//	public Double convert(Long frm);
//}
//
//
// interface ConverterWithOutGeneric2 {
//
//		public Double convert(Double frm);
//	}
//


// public interface Filter<T>  => boolean test()

// This filter interface will be used to test whether a string less than 3 chars and more  
//than 8 char 

// this filter will be used to test if the age is greater than >18 and less than 58