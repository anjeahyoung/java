package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setCatName("금비");
		
		Cat cat2 = cat1.breed();
		cat2.setCatName("금이");
	}
}
