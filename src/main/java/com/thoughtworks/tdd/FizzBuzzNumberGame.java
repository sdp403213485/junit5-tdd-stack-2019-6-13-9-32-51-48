package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {

	
	
	public String fizzBuzz(int number) {
		// TODO Auto-generated method stub
		String strNumber;
		if (number %3==0) {
		return "fizz";
		}else if (number %5==0) {
		return "Buzz";	
		}else if (number %7==0) {
		return "Whizz";
		}else{
		return String.valueOf(number);
			
		}
		
	}
	
}
