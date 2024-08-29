package _crprepration;

public class _001ConstructorOverloading_Student {

	private String name;
	private int age;
	private String grade;

	public _001ConstructorOverloading_Student() { // default constructor
		this.name = "Sadakar";
		this.age = 36;
		this.grade = "A";
	}

	public _001ConstructorOverloading_Student(String name) { // with one parameter
		this.name = name;
		this.age=17;
		this.grade="C";
	}

	public _001ConstructorOverloading_Student(String name, int age) { // with one parameter
		this.name = name;
		this.age = age;
		this.grade="C";
	}

	public _001ConstructorOverloading_Student(String name, int age, String grade) { // with one parameter
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public void display() {
		System.out.println("Name:"+name+","+"Age:"+age+","+"Grade:"+grade);
	}

	public static void main(String args[]) {

		_001ConstructorOverloading_Student student1 = new _001ConstructorOverloading_Student();
		_001ConstructorOverloading_Student student2 = new _001ConstructorOverloading_Student("Hasini");
		_001ConstructorOverloading_Student student3 = new _001ConstructorOverloading_Student("Ram", 37);
		_001ConstructorOverloading_Student student4 = new _001ConstructorOverloading_Student("John", 38, "A");
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
	}
}
