package singeltontest;

public class Book {
	
	private String name;
	private static Book book;
	
	public Book() {
		System.out.println("Constructor");
	}
	
	public static Book getInstance() {
		if (book == null) {
			book = new Book();
		}
		return book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
}
