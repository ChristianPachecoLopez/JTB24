package tutorial52_PassingByValue;

public class App {

	public static void main(String[] args) {
		App app = new App();
		// ==============================
		int value = 7;
		System.out.println("1.value is: " + value);
		app.show(value);
		System.out.println("4.value is: " + value);
		// ==============================
		System.out.println();
		Person person = new Person("Bob");
		System.out.println("1.value is: " + person);
		app.show(person);
		System.out.println("4.value is: " + person);
	}

	public void show(int value) {
		System.out.println("2.value is: " + value);

		value = 8;
		System.out.println("3.value is: " + value);
	}

	public void show(Person person) {
		System.out.println("2.value is: " + person);
		person.setName("Sue");
		person = new Person("Mike");
		person.setName("Tom");
		System.out.println("3.value is: " + person);

	}

}
