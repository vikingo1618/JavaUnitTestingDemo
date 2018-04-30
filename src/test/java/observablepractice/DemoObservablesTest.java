package observablepractice;

import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class DemoObservablesTest {
	
	int[] arrNumbers = {1, 5,10, 20};
	int[] testList = {};
 	
	@Test
	@DisplayName("Should return greater than ten")
	public void shouldGreaterThanTen() {
		
		int[] listExpected = {20}; 
		int[] result = DemoObservables.getGreaterThanTen(arrNumbers);
		
		assertArrayEquals(listExpected, result);
	}
	
	
	@Test
	@DisplayName("Should duplicate")
	public void shouldDuplicate() {
		
		int[] listExpected = {2, 10, 20, 40};
		int[] result = DemoObservables.duplicateNumbers(arrNumbers);
		
		assertArrayEquals(listExpected, result);
		
	}

	
	@Test
	@DisplayName("Null Array")
	public void shouldValidateEmptyArrayDuplicate() {
		
		int[] listExpected = {};
		
		int[] result = DemoObservables.duplicateNumbers(testList);
		
		assertArrayEquals(listExpected, result);
		
	}

	@Test
	@DisplayName("Null Array")
	public void shouldValidateEmptyArrayGreater() {
		
		int[] listExpected = {};
		
		int[] result = DemoObservables.getGreaterThanTen(testList);
		
		assertArrayEquals(listExpected, result);
}
	}
