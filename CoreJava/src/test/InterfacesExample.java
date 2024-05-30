package test;
interface Animal{
	void animalSound();
	void animalSleep();
}
public class InterfacesExample implements Animal{
	
	public void animalSound() {
		System.out.println("Animal is making sound");
	}
	public void animalSleep() {
		System.out.println("Animal is sleeping");
	}
	public static void main(String args[]) {
		InterfacesExample ie = new InterfacesExample();
		ie.animalSound();
		ie.animalSleep();
	}

}
