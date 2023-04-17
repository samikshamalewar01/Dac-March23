package assignment2;

public class Program3 {
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Program3() {
		
		setTitle("Atomic Habits");
		setAuthor("James Clear");
		setPublisher("PenguinRandomHouse.com");
		setIsbn("9780442178582");
		setYear(2020);
		price = 250.50f;
		quantity = 5;
	}

	public void increaseQuantity(int quan) {
		this.quantity = quantity + quan;
		System.out.println(quantity);
	}

	public void decreaseQuantity(int quan) {
		this.quantity = quantity - quan;
		System.out.println(quantity);
	}

	public double getInventoryValue() {
		return quantity * price;
	}


        public static void main(String[] args) {
		Program3 book = new Program3();
		book.increaseQuantity(8);
		book.decreaseQuantity(2);
		System.out.println("Total Value of Inverntory: " + book.getInventoryValue());
		System.out.println("Book Title: " + book.getTitle());
		System.out.println("author    : " + book.getAuthor());
		System.out.println("publisher : "+ book.getPublisher());
		System.out.println("isbn      : " + book.getIsbn());
		System.out.println("year      : " + book.getYear());
		System.out.println("price     : "+ book.getPrice());
		System.out.println("Quantity  : " + book.getQuantity());
	}

}

