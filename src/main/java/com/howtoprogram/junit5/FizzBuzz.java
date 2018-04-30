package com.howtoprogram.junit5;

public class FizzBuzz {

	public String[] fizzBuzz(int start, int end) {
	    String[] arr = new String[end];
	    
	    if(end > start) {
		    for(int i = start; i <= end; i++) {
		        if(i % 15 == 0) {
		            arr[i - start] = "FizzBuzz";
		        } else if(i % 3 == 0) {
		            arr[i - start] = "Fizz";
		        } else if(i % 5 == 0) {
		            arr[i - start] = "Buzz";
		        } else {
		            arr[i - start] = String.valueOf(i);
		        }
	System.out.println(arr[i-start]);
		    }
	    }else {
	    	System.out.println("ERROR: Watchout, mate!!");
	    }                                                   
	    return arr;
	}
}