package _crfinalprep2;

import _crfinalprep2.User.UserBuilder;

class User{
	
	// required paramters
	String name;
	int age;
	// Optional parameters
	String phone;
	String adresss;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdresss() {
		return adresss;
	}
	public User(UserBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.phone = builder.phone;
		this.adresss = builder.adresss;
	}
	// Builder class
	public static class UserBuilder{
		
		String name;
		int age;
		String phone;
		String adresss;
		public UserBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder setAdresss(String adresss) {
			this.adresss = adresss;
			return this;
		}
		public User build() {
			return new User(this);
		}
	}
	
}
public class BuilderDesignPattern {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder("Sadakar", 36).setPhone("9989721090").build();
		System.out.println(user.getName()+" "+user.getAge()+" "+user.getPhone()+" "+user.getAdresss());
	}
}
