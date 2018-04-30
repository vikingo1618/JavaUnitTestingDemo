package singletontest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import singeltontest.Book;

public class BookTest {
	
	@Test 
	public void singletonTest() {
		Book book = Book.getInstance();
		book.setName("Vikingo");
		assertEquals("Vikingo",book.getName());
		
		Book book1 = Book.getInstance();
		book1.setName("Manolo");
		assertEquals("Manolo",book1.getName());
		
		Book book2 = Book.getInstance();
		book2.setName("Max");
		assertEquals("Max",book2.getName());
	}
}
