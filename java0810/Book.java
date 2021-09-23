package java0810;
import java.util.ArrayList;
import java.util.List;

public class Book {
	String name;
	int price;
	
	public Book(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public int getPrice() {
	return price;
	}
	
	public void setPrice(int price) {
	this.price = price;
	}
}
