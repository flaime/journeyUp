package annaLinus.spel;

import java.util.HashMap;
import java.util.Scanner;

public class Start {

	private boolean isOn = false;
	private Room startRoom;
	private Room inRoom;

	public static void main(String[] args) {
		final Start start = new Start();
		start.startGameYay();
	}

	public void startGameYay() {
		initiateGame();

		isOn = true;
		while (isOn) {
			System.out.println(inRoom);
			returnKeyboardString();


		}
	}

	public String returnKeyboardString() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Skriv nåt");
		String myString = keyboard.nextLine();
		System.out.println(myString);
		return myString;
	}

	public void initiateGame() {
		String description = "Här är hallen, med en klicking clocking clock.";
		startRoom = new Room("hall", description);
		startRoom.addThing(new Thing("Klocka", 1));


		inRoom = startRoom;
	}


}
