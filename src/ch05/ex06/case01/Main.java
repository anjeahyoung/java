package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love Java.");
//		Man.tell("");
		
		Man man = new Man();
		man.tell("I love Java.");
		man.say("Hello.");
	}
}