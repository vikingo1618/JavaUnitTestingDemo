package observablepractice;

import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class DemoObservablesTest2 {
	
	Integer [] arrNumbers = {1, 5,10, 20};
	Integer [] testList = {};
 	
	@Test
	@DisplayName("Should return greater than ten")
	public void shouldGreaterThanTen() {
		
		Integer[] listExpected = {20}; 
		Integer[] result = DemoObservables2.getGreaterThanTen(arrNumbers);
		
		assertArrayEquals(listExpected, result);
	}
	
	
	@Test
	@DisplayName("Should duplicate")
	public void shouldDuplicate() {
		
		Integer[] listExpected = {2, 10, 20, 40};
		Integer[] result = DemoObservables2.duplicateNumbers(arrNumbers);
		
		assertArrayEquals(listExpected, result);
		
	}

	
	@Test
	@DisplayName("Null Array")
	public void shouldValidateEmptyArrayDuplicate() {
		
		Integer[] listExpected = {};
		
		Integer[] result = DemoObservables2.duplicateNumbers(testList);
		
		assertArrayEquals(listExpected, result);
		
	}

	@Test
	@DisplayName("Null Array")
	public void shouldValidateEmptyArrayGreater() {
		
		Integer[] listExpected = {};
		
		Integer[] result = DemoObservables2.getGreaterThanTen(testList);
		
		assertArrayEquals(listExpected, result);
}
	}
