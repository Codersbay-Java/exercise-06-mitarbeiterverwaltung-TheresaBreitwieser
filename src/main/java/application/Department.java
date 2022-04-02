package application;

import java.util.Random;

public class Department {

	String name;
	int id;
	String country;
	String city;

	public Department(String name, String country, String city) {
		this.name= name;
		this.id = getRandomID();
		this.country = country;
		this.city=city;
	}

	//default department
	public Department() {
		name = "Test";
		id = getRandomID();
		country = "Neverland";
		city= "Gotham";
	}


	public boolean isEquals(Department other) {
		if(id == other.id) {
			return true;
		} else {
			return false;
		}

	}

	public int getRandomID() {
		Random random=new Random();
		return random.nextInt(1001);
	}

	public String toString() {
		return this.name + " " + this.city + " " + this.country;
	}
}
