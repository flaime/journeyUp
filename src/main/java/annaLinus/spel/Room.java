package annaLinus.spel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Room {

	private String name;
	private String description;
	private List<Thing> thingList = new LinkedList<>();

	public Room(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public void addThing(Thing thing) {
		thingList.add(thing);

	}

	@Override
	public String toString() {
		return name + ": " + description;
	}
}
