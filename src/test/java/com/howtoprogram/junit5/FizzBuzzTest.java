package com.howtoprogram.junit5;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.AfterEach;


import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {
	
	String[] fizzing = {"1","2","Fizz","4", "Buzz","Fizz","7","8","Fizz","Buzz","11",
						"Fizz","13","14","FizzBuzz"};
	
	String[] buzzing = {"1","2","Fizz","4", "Buzz","Fizz","7","8","Fizz","Buzz","11",
			"Fizz","13","14","FizzBuzz"};
	
	String[] mockBuzzing = {"1","2","Fizz","4", "Buzz","Fizz","7","8","Fizz","Buzz","11",
			"Fizz","13","14","Vikingo"};
	
	String[] notBuzzing = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	
  private FizzBuzz testFizz = new FizzBuzz();
  
  @AfterEach
  void tearDown() {
	  System.out.println("DONE!");
  }
  
  @Test
  @DisplayName("FizzBuzz Test")
  void testFizzBuzz() {
	System.out.println("Fizzing and Buzzing");
    assertArrayEquals(fizzing,testFizz.fizzBuzz(1,15));
  }
    
  @Test
  @DisplayName("ivalid FizzBuzz Test")
  void testInvalidFizzBuzz() {
	System.out.println("Not Fizzing nor Buzzing");
    assertArrayEquals(notBuzzing,testFizz.fizzBuzz(45,15));
  }

        
        @Test
        @DisplayName("calculator Test Mockito")
        void testCalculatorMockito() {
        	FizzBuzz mockFizz = mock(FizzBuzz.class);
      	System.out.println("Testing FizzBuzz With Mockito");
      	when(mockFizz.fizzBuzz(1, 15)).thenReturn(buzzing);
      	when(mockFizz.fizzBuzz(69,420)).thenReturn(mockBuzzing);
      	
      	
      	
          assertArrayEquals(fizzing,mockFizz.fizzBuzz(1,15));
          assertArrayEquals(mockBuzzing,mockFizz.fizzBuzz(69,420));
          
          
  }
        
  }
    