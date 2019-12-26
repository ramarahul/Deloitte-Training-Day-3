package Assignments;

public class Employee extends Person {
	
	
	private int id;
	private Department dept;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dept=" + dept + "]";
	}
	public Employee(String name,int id, Department dept) {
		super(name);
		this.id = id;
		this.dept = dept;
	}
	
	public Employee(String name, Address addr, int id, Department dept) {
		super(name,addr);
		this.id = id;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	

}
