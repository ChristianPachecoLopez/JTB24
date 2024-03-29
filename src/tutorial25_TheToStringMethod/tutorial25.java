package tutorial25_TheToStringMethod;
class Frog2 {

	private int id;
	private String name;

	public Frog2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {

		return String.format("%-4d: %s", id, name);

		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append(id).append(": ").append(name);
		 * 
		 * return sb.toString();
		 */
	}
}

public class tutorial25 {

	public static void main(String[] args) {
		Frog2 frog1 = new Frog2(7, "Freddy");
		Frog2 frog2 = new Frog2(5, "Roger");

		System.out.println(frog1);
		System.out.println(frog2);
	}
}