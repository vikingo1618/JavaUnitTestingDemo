package com.howtoprogram.junit5;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


//import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTest {
  private Calculator calcTest = new Calculator();
	  int n1=0;
	  int n2=1;
  
  @BeforeAll
  static void setUpAll() {
	  System.out.println("Hacking NASA");
  }
  

  @AfterEach
  void tearDown() {
	  System.out.println("DONE!");
  }
  
  @AfterAll
  static void tearDownAll() {
	  System.out.println("Test Finished");
  }
  
  
  @Test
  @DisplayName("Addition Test")
  void testAddition() {
	System.out.println("Testing Addition");
    assertEquals((n1+n2),calcTest.Addition(n1,n2));

    
  }
    
    @Test
    @DisplayName("Substraction Test")
    void testSubstraction() {
  	System.out.println("Testing Substraction");
      assertEquals((n1-n2),calcTest.Substraction(n1,n2)); 
    }
    
      
      @Test
      @DisplayName("Multiplication Test")
      void testMultiplication() {
    	System.out.println("Testing Multiplication");
        assertEquals((n1*n2),calcTest.Multiplication(n1,n2));
      }
        
        @Test
        @DisplayName("Division Test")
        void testCalculator() {
      	System.out.println("Testing Division");
          assertEquals((n1/n2),calcTest.Division(n1,n2));
  }
        
        @Test
        @DisplayName("calculator Test Mockito")
        void testCalculatorMockito() {
        	Calculator mockalculator = mock(Calculator.class);
      	System.out.println("Testing Calculator With Mockito");
      	when(mockalculator.Addition(20, 20)).thenReturn(80);
      	when(mockalculator.Substraction(10, 5)).thenReturn(30);
      	when(mockalculator.Multiplication(6, 10)).thenReturn(200);
      	when(mockalculator.Division(10, 5)).thenReturn(100);
      	
      	
          assertEquals(80,mockalculator.Addition(20,20));
          assertEquals(30,mockalculator.Substraction(10,5));
          assertEquals(200,mockalculator.Multiplication(6,10));
          assertEquals(100,mockalculator.Division(10,5));
          
          
  }
        
  }
    