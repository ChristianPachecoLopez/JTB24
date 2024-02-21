package tutorial07_StringsWorkingWithText;

public class App {

	public static void main(String[] args) {
		int myInt = 7;

		String text = "Hello";
		String blank = " ";
		String name = "Bob";
		String greeting = text + blank + name;

		System.out.println(greeting);
		System.out.println("Hello" + " " + name);
		System.out.println("My integer is: " + myInt);

		double myDouble = 7.8;

		System.out.println("My number is: " + myDouble + ".");

	}
}
