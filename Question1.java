package com.valantic.fs.training;

/**
 * 
If we list all the integers below 10 that are multiples of 3 or 7, we get 3, 6, 7  and 9. The sum of these is 25.

Print out the sum of all the multiples of 3 or 7 below 1000.

 * 
 * author pamueller
 *
 */
public class Question1 {
	
    public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < 100; i++) {
		if (i % 3 == 0 || i % 7 == 0)
		
			sum += i;
		}
	
		System.out.println("Sum: " +sum);
	}

}
