package test;

import java.util.ArrayList;

public class Employee {
	
	private String name;
	private int id;
	private double salary;
	private Role role;
	private Department dept;
	private Employee manager;
	private boolean salaryIncremented;
	
	
	public Employee(String name, int id, double salary, Role role, Department dept, Employee manager) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
		this.dept = dept;
		this.manager = manager;
		salaryIncremented=false;
	}
	
	public void incrementSalary(String role,ArrayList<Employee> emps, int percent) {
		if(this.manager!=null) {
			return;
		}
		else {
			for(Employee e: emps) {
				if(e.getManager()==this&&e.getRole().getName().equals(role)) {
					e.setSalary(e.getSalary()+((e.getSalary()*percent)/100));
					e.setSalaryIncremented(true);
				}
			}
		}
	}
	
	
	public boolean isSalaryIncremented() {
		return salaryIncremented;
	}

	public void setSalaryIncremented(boolean salaryIncremented) {
		this.salaryIncremented = salaryIncremented;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", role=" + role + ", dept=" + dept
				+ ", manager=" + manager + "]";
	}
	
	

}
