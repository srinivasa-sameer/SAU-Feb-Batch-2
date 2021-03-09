package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
	
	@BeforeClass
	public static void useBeforeClass() throws Exception {
		System.out.println("Befor Running Class");
	}
	@Before
	public void useBefore() throws Exception {
		System.out.println("Before Annotation");
	}
	
	@Test
	public void check1(){
		System.out.println("Is 2 a Prime Number?"+PrimeClass.isPrime(2));
		assertEquals(false,PrimeClass.isPrime(2));
	}
	@Test
	public void check2(){
		System.out.println("Is 10 a Prime Number?"+PrimeClass.isPrime(10));
		assertEquals(true,PrimeClass.isPrime(10));
	}
	
	@After
	public void useAfter() throws Exception {
		System.out.println("After Annotation");
	}

	@AfterClass
	public static void useAfterClass() throws Exception {
		System.out.println("After Running Class");
	}
}
