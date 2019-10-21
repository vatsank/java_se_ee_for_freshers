package com.training.functional;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.*;

public class BuiltInFunctional {

	public static void main(String[] args) {

		Function<LocalDate,Integer> dayOfTheWeek =
				(date) -> date.getDayOfWeek().getValue();

				
				System.out.println(dayOfTheWeek.apply(LocalDate.of(2019, Month.OCTOBER,13)));
				
	}

}
