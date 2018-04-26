package com.howtoprogram.junit5;

public class Calculator {
	
	 int Addition(int num1,int num2) {
		return num1+num2;
	}
	
	 int Substraction(int num1,int num2) {
		return num1-num2;
	}
	
	 int Multiplication(int num1,int num2) {
		return num1*num2;
	}
	
	 int Division(int num1,int num2) {
		 Integer returnValue = (num2 == 0) ? null : (num1/num2);
		 return returnValue;
	}
}
