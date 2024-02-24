package tutorial51_TransientKeywordAndMoreSerialization;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -3095509996495330048L;
	private transient int id;
	private String name;
	private static int count;

	public Person() {
		System.out.println("Default constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
}
