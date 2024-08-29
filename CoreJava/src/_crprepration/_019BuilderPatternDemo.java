package _crprepration;

class User {

	// required parameters
	private String firstName;
	private String lastName;

	// optional parameters
	private int age;
	private String phone;
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public static class UserBuilder {
		private String firstName;
		private String lastName;

		private int age;
		private String phone;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}
}

public class _019BuilderPatternDemo {

	public static void main(String args[]) {
		User user = new User.UserBuilder("John", "Doe").setAge(30).setPhone("1234567890").setAddress("Hyderabad")
				.build();

		System.out.println("User Details");
		System.out.println("First Name: " + user.getFirstName());
		System.out.println("Last Name: " + user.getLastName());
		System.out.println("Age: " + user.getAge());
		System.out.println("Phone: " + user.getPhone());
		System.out.println("Address: " + user.getAddress());

	}

}
