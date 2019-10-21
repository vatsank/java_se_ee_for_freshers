package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.PublishResult;

public class TestPublishResult {

	private PublishResult objUnderTest;
	
	@Before
	public void setUp() throws Exception{
		
		objUnderTest = new PublishResult();
	}
	
	@After
    public void tearDown() throws Exception{
		
		objUnderTest = null;
	}
	
	@Test
	public void testCondtion1() {
		
		 String actual = objUnderTest.findGrade(20);
		 String expected= "D";
		 
		 assertEquals(expected, actual);
	}

}
