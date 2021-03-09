package com.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Program_Runner {
	public static void main(String[] args) {
		
		  Result result1 = JUnitCore.runClasses(Test1.class);
	     
	      for (Failure failure : result1.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result1.wasSuccessful());
	      
	      Result result2 = JUnitCore.runClasses(Test2.class);
	      
	      for (Failure failure : result2.getFailures()) {
		         System.out.println(failure.toString());
		      }
				
		      System.out.println(result2.wasSuccessful());
	   }
}
