package Assignments;

public class Department {
	
	private String location;
	private String name;
	
	public Department(String location, String name) {
		super();
		this.location = location;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department(String location) {
		super();
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [location=" + location + ", name=" + name + "]";
	}
}
