package week14;

public class Car implements Comparable<Car>{
	private String name;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Car o) {
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Car " + name;
	}
	
	
}
