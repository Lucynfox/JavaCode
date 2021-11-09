package test;

public class Person {
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void greet() { // non-static. Must instanciate first. 
		System.out.println("Hi i'm " + name + " and i'm " + age  +"years old. And my height is " + height);
	}
	
	
	public static void hello () { // static 
		System.out.println("HElooo");
	}
	
	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	
		
	}
