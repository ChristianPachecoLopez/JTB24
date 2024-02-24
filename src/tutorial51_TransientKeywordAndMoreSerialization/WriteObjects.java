package tutorial51_TransientKeywordAndMoreSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		try (FileOutputStream fs = new FileOutputStream("test.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs)) {

			Person person = new Person(543, "Mike");
			Person.setCount(0);
			os.writeObject(person);
			System.out.println(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}