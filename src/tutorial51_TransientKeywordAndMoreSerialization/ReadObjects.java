package tutorial51_TransientKeywordAndMoreSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (FileInputStream fi = new FileInputStream("test.ser")) {

			ObjectInputStream os = new ObjectInputStream(fi);

			Person person1 = (Person) os.readObject();
			Person person2 = (Person) os.readObject();

			os.close();

			System.out.println(person1);
			System.out.println(person2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}