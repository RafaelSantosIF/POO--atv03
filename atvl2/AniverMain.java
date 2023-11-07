package atvl2;

public class AniverMain {
	public static void main(String[] args) {
		Person pessoa = new Person();
		pessoa.registerPerson("Ronaldinho", 28, 8, 2004);
		pessoa.birthday.nowDate(7, 11, 2023);
		
		System.out.println("Idade: " + pessoa.getAge());
		
		pessoa.birthday.atual.skipTimeDays(125);
		pessoa.birthday.atual.skipTimeMonths(3);
		pessoa.birthday.atual.skipTimeYears(4);
		
		pessoa.printPerson();
	}
	
}
