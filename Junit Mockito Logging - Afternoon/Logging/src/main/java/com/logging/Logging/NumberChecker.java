package com.logging.Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class NumberChecker {

	static Logger log = LogManager.getLogger(NumberChecker.class);

	public static void main(String[] args) {
		log.info("Function to check if entered number is less than 20 and greater than 0 or not");
		
		for(int i = -1 ; i <=20 ; i++){
			if(i<0)
				log.fatal(" You cannot input negative number");
			else if (i==0)
				log.warn(" You have entered 0");
			else if(i>20)
				log.error("Number is greater than 20");
			else
				log.debug(i+" is a  Number lying between 0 and 20"+ isNumberbtwtwenty(i));
		}
	}
	public static boolean isNumberbtwtwenty(int n) {
        if(n<0)
        	return false;
        else if (n>20)
        	return false;
        else return true;
	}
}
