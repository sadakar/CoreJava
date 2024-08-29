package test.oops;

class Animal{
	
	void makeSound() {
		System.out.println("Animal is making sound");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog is barking");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Can is meowing");
	}
}

public class MethodOverriding_RunTimePolymorphism {

	public static void main(String args[]) {
	Animal myAnimal = new Animal();
	Animal myDog = new Dog(); // up casting
	Animal myCat = new Cat(); // up casting
	
	myAnimal.makeSound();
	myDog.makeSound();
	myCat.makeSound();
	}
}
