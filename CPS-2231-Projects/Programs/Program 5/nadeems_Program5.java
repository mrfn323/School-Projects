/*
 * Program Written By: Syed Fahad Nadeem
 * 
 * Description: This program creates a class that has Instance Variables 
 * that would be normal for a book. This program makes Constructors, Accessors, and
 * Mutators to set all of the Instance variables. 
 */
public class nadeems_Program5 {

	//Instance Variables
	private String bookTitle;
	private int ISBN;
	private String bookAuthor;
	private double bookPrice;
	
	//Default Constructor
	public nadeems_Program5(){
		
		bookTitle = " ";
		ISBN = 0;
		bookAuthor = " ";
		bookPrice = 0.0;
		
	}
	
	//Second Constructor
	public nadeems_Program5(String title, int isbn, String Author, double price){
		
		bookTitle = title;
		ISBN = isbn;
		bookAuthor = Author;
		bookPrice = price;
		
	}
	
	//Accessors Methods
	public String getBookTitle(){
		
		return bookTitle;
		
	}
	
	public int getISBN(){
		
		return ISBN;
		
	}
	
	public String getAuthorName(){
		
		return bookAuthor;
		
	}
	
	public double getPrice(){
		
		return bookPrice;
		
	}
	
	//Mutator Methods
	public void setBookTitle(String titleReplace){
		
		bookTitle = titleReplace;
		
	}
	
	public void setBookISBN(int isbnReplace){
		
		ISBN = isbnReplace;
		
	}
	
	public void setAuthor(String authorReplace){
		
		bookAuthor = authorReplace;
		
	}
	
	public void setPrice(double priceReplace){
		
		bookPrice = priceReplace;
		
	}
	
}
