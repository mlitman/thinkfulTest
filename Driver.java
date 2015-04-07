import java.util.LinkedList;

public class Driver 
{
	public static void main(String[] args) 
	{
		//public means its available everywhere
		//private - means its available only within this class
		//protected
		/*
        david = Musician.__init__(["Twang", "Thrumb", "Bling"])
        data = 7
        derek = Musician(["Boink", "Bow", "Boom"])
        david = 5
        print(david)
        temp = 5
        temp = "mike"
        var temp
        temp = "mike"
        temp = 5
		 */
		//type var_name = value;
		//type var_name;
		
		//new keyword - our real estate agent
		String[] someSounds = {"Boink","Bow","Boom"};
		Musician david = new Musician(someSounds);
		Musician derek = new Musician(someSounds);
		Object[] someMusicians = {david, derek};
		LinkedList<Musician> ll = new LinkedList<Musician>();
		ll.add(david);
		ll.add(derek);
		ll.get(0).play();
		
		double pi = 3.14;
		int piTruncated = (int)pi;
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		int num = Integer.parseInt("1235");
	}
}
