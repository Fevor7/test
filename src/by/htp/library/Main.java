package by.htp.library;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setPrice(39.4);
		book.setTitle("First Book fvg");
		
		Book book2 = new Book(18.6, "Second book");
		System.out.println("Book1: price= " + book.getPrice()
		+ " " + "title= " + book.getTitle());
		
		System.out.println("Book2: price= " + book2.getPrice()
		+ " " + "title= " + book2.getTitle());
		
		
		
		
		Magazine magazine = new Magazine();
		magazine.setPrice(10);
		magazine.setTitle("Cool magazine");
		
		PrintedEdition printEdition = new Book();
		Object obj = new Book();
		//Book book = new PrintedEdition();
		
		PrintedEdition prints[];
		
		
		//System.out.println
	}

}
