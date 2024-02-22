package tutorial34_UsingGenerics;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

/////////////////// Before Java 5 ////////////////////////
		ArrayList list = new ArrayList();

		list.add("apple");
		list.add("banana");
		list.add("orange");

		String fruit = (String) list.get(1);

		System.out.println(fruit);

		/////////////// Modern style //////////////////////////////

		ArrayList<String> strings = new ArrayList<String>();

		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");

		String animal = strings.get(1);

		System.out.println(animal);
	}

}