package ch06.ex04.case01;

public class Animal {
	private String animalName;
	
	public Animal() {}
	
	public Animal(String animalName) {
		this.animalName = animalName;
	} //생성자는 상속 안됨

	public String getAnimalName() {
		return this.animalName;
	}
}
