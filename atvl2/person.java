package atvl2;

public class Person {
	String name;
	Date birthday;
	int age;
	
	public void registerPerson(String name, int day, int month, int year) {
		this.name = name;
		this.birthday = new Date();
		birthday.day = day;
		birthday.month = month;
		birthday.year = year;
	}
	
	public int getAge() {
		age = this.birthday.atual.year - this.birthday.year;
		
		if (this.birthday.atual.month < this.birthday.month) {
			age--;
		}
		return age;
	}
	
	public void printPerson() {
		System.out.println("Nome: " + this.name);
		System.out.println("Idade: " + this.age);
		System.out.printf("Nascimento: %d/%d/%d", this.birthday.day, this.birthday.month, this.birthday.year);
	}
}
