package annaLinus.spel;

import java.util.HashMap;

public class Thing {

	private String name;
	private int timesCanBePickedUp;


	public Thing(String name, int timesCanBePickedUp){
		this.name=name;
		this.timesCanBePickedUp=timesCanBePickedUp;
	}

	public String getName(){
		return name;
	}

	public int getTimesCanBePickedUp(){
		return timesCanBePickedUp;
	}
}
