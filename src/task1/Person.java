package task1;

import java.util.Scanner;

public class Person {
	String name;
	int age;

	void displayInfo() {
		System.out.println("Name of Person is " + name + " age is " + age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		System.out.print("Enter name of person: ");
		person.name = sc.next();
		System.out.print("Enter age of person: ");
		person.age = sc.nextInt();
		
		person.displayInfo();
	}

}
