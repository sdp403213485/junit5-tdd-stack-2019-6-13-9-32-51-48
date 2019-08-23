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
		
		Assertions.assertEquals("Fizz", word);
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
	
	
	@Test
	 public void should_return_Result_when_fizzBuzz_given_Params() {
	  //given
	  String[] word = new String[]{"1","2","Fizz","4",
	    "Buzz","Fizz","Whizz","8","Fizz","Buzz",
	    "11","Fizz","13","Whizz","FizzBuzz","16",
	    "17","Fizz","19","Buzz","FizzWhizz","22",
	    "23","Fizz","Buzz","26","Fizz","Whizz",
	    "29","FizzBuzz","31","32","Fizz","34",
	    "BuzzWhizz","Fizz","37","38","Fizz",
	    "Buzz","41","FizzWhizz","43","44","FizzBuzz",
	    "46","47","Fizz","Whizz","Buzz","Fizz","52",
	    "53","Fizz","Buzz","Whizz","Fizz","58","59",
	    "FizzBuzz","61","62","FizzWhizz","64","Buzz",
	    "Fizz","67","68","Fizz","BuzzWhizz","71",
	    "Fizz","73","74","FizzBuzz","76","Whizz",
	    "Fizz","79","Buzz","Fizz","82","83","FizzWhizz",
	    "Buzz","86","Fizz","88","89","FizzBuzz","Whizz",
	    "92","Fizz","94","Buzz","Fizz","97","Whizz","Fizz",
	    "Buzz","101","Fizz","103","104","FizzBuzzWhizz",
	    "106","107","Fizz","109","Buzz","Fizz","Whizz","113",
	    "Fizz","Buzz","116","Fizz","118","Whizz","FizzBuzz"};
	  FizzBuzzNumberGame fizzBuzzNumberGame= new FizzBuzzNumberGame();
	  
	  // when
			 for(int i = 1; i <= 120; i++) {
		 String  assertWord = fizzBuzzNumberGame.fizzBuzz(i);
	   // Then
	   Assertions.assertEquals(word[i-1], assertWord);
	  }
	 }
}


