package tutorial20_MethodParameters;
class Robot {
	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance) {
		System.out.println("moving " + distance + " meters in direction " + direction);
	}
}

public class tutorial20 {

	public static void main(String[] args) {
		Robot sam = new Robot();
		String greeting = "Hello there.";
		sam.speak(greeting);

		sam.speak("Hi I'm Sam.");

		sam.jump(7);

		sam.move("West", 12.2);

	}

}
