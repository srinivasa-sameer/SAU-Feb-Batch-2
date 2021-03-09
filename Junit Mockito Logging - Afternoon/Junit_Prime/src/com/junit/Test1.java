package com.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Test1 {

	@Test
	public void check1(){
		System.out.println("Is 13 a prime number?"+PrimeClass.isPrime(13));
		assertEquals(true,PrimeClass.isPrime(13));
	}
	
	@Test
	public void checks2(){
	System.out.println("Is 15 a prime number?"+PrimeClass.isPrime(15));
	assertEquals(true,PrimeClass.isPrime(15));
	}
}
