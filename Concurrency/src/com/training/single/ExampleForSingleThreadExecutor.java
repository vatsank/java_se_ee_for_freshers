package com.training.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.task.DisplayTask;

public class ExampleForSingleThreadExecutor {

	public static void main(String[] args) {

		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		// ExecutorService service = Executors.newSingleThreadExecutor();
		
		
		Runnable task1 = new DisplayTask(20);
		
		Runnable task2 = new DisplayTask(30);

		service.submit(task1);
		
		service.submit(task2);
		
		
		service.shutdown();
	}

}
