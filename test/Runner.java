package test;

import java.util.Scanner;

public class Runner {
	
//	public static final int var = 5;
	public static void main(String[] args) {
//		Person jordan = new Person("Jordan", 20, 170);
//		Person jack = new Person("Jack", 32, 180);
//		Person josh = new Person("Josh", 54, 120);
//		Person john = new Person("John", 21, 132);
//		Person someone = new Person("Lucy", 160);
//		
//		
//		jordan.greet();
//		jack.greet();
//		josh.greet();
//		john.greet();
//		Person.hello();
//		someone.greet();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter you name:");
		String name = scan.nextLine();
		System.out.println("please enter you age:");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("please enter you name again");
		System.out.println("Hello "+ name+ " your age is:" + age);
		scan.close();
	}

}
