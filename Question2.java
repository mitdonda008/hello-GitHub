package com.valantic.fs.training;

/**
 * 
The prime factors of 30 are 2, 3, and 5.
What is the largest prime factor of the number 3453232455L ?
 * 
 * author pamueller
 *
 */
public class Question2 {
	
	public static long maxPrimeFactors(long n) 
	{ 
	    
	    long maxPrime = -1; 
	  
	    while (n % 2 == 0) { 
	        maxPrime = 2;  
	        n >>= 1;  
	    } 
	  
	    for (int i = 3; i <= Math.sqrt(n); i += 2) { 
	        while (n % i == 0) { 
	            maxPrime = i; 
	            n = n / i; 
	        } 
	    } 
	  
	    if (n > 2) 
	        maxPrime = n; 
	  
	    return maxPrime; 
	} 
    
	public static void main(String[] args) {
     
		long n = 3453232455L;
		System.out.println("Largest prime factor of 3453232455L is: " +maxPrimeFactors(n));
	}
}
