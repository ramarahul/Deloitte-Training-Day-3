package Assignments;

public class Person {
	
	protected String name;
	protected Address add;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person(String name, Address add) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.add = add;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", add=" + add + "]";
	}


}
