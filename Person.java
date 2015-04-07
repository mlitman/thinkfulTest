import java.util.Random;


public class Person 
{
	//Fields
	//public - everyone can access it
	//private - only accessible within this class (Person)
	//protected - only accessible within this class and children of this class
	//package level access
	private String fname;
	private String lname;
	private int age;
	private static Random r = new Random();
	
	//Constructor
	public Person(String fname, String lname, int age)
	{
		//this - is how a object refers to itself from within itself
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	//Methods
	
	public static int getRandomInt()
	{
		return r.nextInt();
	}
	
	//is an instance method because he is defined without the static keyword
	public void display()
	{
		System.out.println("Hi, my name is: " + this.fname + " " + this.lname);
	}

	//is a class method because he is defined with the static keyword
	static void doSomething()
	{
		//within a static context
		//I don't know about this
		//I don't know about fname or lname, or age
		//all I know about is what is inside the curly braces here
		System.out.println("I am a static method!!!!");
	}
	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getAge() {
		return age;
	}
}
