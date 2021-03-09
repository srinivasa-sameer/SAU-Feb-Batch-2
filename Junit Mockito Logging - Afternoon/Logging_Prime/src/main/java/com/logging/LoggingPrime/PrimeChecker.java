package com.logging.LoggingPrime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PrimeChecker {

	static Logger log = LogManager.getLogger(PrimeChecker.class);

	public static void main(String[] args) {
		log.info("Function to check if entered number is Prime or Not.");
		
		for(int i = -1 ; i <=101 ; i++){
			if(i<0)
				log.fatal(" You cannot input negative number");
			else if (i==0)
				log.warn(" 0 is neither prime nor composite");
			else if(i>100)
				log.error("Number is greater than 100");
			else
				log.debug(i+" is a Prime Number"+ isPrime(i));
		}
	}
	public static boolean isPrime(int n) {
        if (n <= 1) 
            return false; 

        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
	}
}
