package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {
	@Test
	public void should_return1_when_fizzbuzz_given_1() {
		//given
		int number =1;
		FizzBuzzNumberGame fizzBuzzNumberGame= new FizzBuzzNumberGame();
			
		
		//when
		String word =fizzBuzzNumberGame.fizzBuzz(number);
		
		//then
		
		Assertions.assertEquals("1", word);
	}
	
	
	
	
	@Test
	public void should_return3_when_fizzbuzz_given_3() {
		//given
		int number =3;
		FizzBuzzNumberGame fizzBuzzNumberGame= new FizzBuzzNumberGame();
			
		
		//when
		String word =fizzBuzzNumberGame.fizzBuzz(number);
		
		//then
		
		Assertions.assertEquals("fizz", word);
	}

	
	@Test
	public void should_return5_when_fizzbuzz_given_5() {
		//given
		int number =5;
		FizzBuzzNumberGame fizzBuzzNumberGame= new FizzBuzzNumberGame();
			
		
		//when
		String word =fizzBuzzNumberGame.fizzBuzz(number);
		
		//then
		
		Assertions.assertEquals("Buzz", word);
	}
	
	
	@Test
	public void should_return7_when_fizzbuzz_given_7() {
		//given
		int number =7;
		FizzBuzzNumberGame fizzBuzzNumberGame= new FizzBuzzNumberGame();
			
		
		//when
		String word =fizzBuzzNumberGame.fizzBuzz(number);
		
		//then
		Assertions.assertEquals("Whizz", word);
	}
	
	
	@Test
	public void should_return14_when_fizzbuzz_given_14() {
		//given
		int number =14;
		FizzBuzzNumberGame fizzBuzzNumberGame= new FizzBuzzNumberGame();
			
		
		//when
		String word =fizzBuzzNumberGame.fizzBuzz(number);
		
		//then
		Assertions.assertEquals("Whizz", word);
	}
	
	@Test
	public void should_return14_when_fizzbuzz_given_16() {
		//given
		int number =16;
		FizzBuzzNumberGame fizzBuzzNumberGame= new FizzBuzzNumberGame();
			
		
		//when
		String word =fizzBuzzNumberGame.fizzBuzz(number);
		
		//then
		Assertions.assertEquals("16", word);
	}

}


