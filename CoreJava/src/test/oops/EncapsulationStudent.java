package test.oops;

class Student {
	private int age;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}

public class EncapsulationStudent {

	public static void main(String args[]) {
		Student s = new Student();
		s.setAge(20);
		s.setName("Sadakar");

		System.out.println(s.getAge() + " " + s.getName());

	}
}
