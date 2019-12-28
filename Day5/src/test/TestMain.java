package test;

import java.util.ArrayList;

public class TestMain {
	
	private static ArrayList<Employee> emps;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateEmployees();
		listAllEmployees();
		listEmployeeGivenDept("Dept1");
		listEmployeesGivenRole("Tester");
		incrementSalariesForEmployeesGivenRole("Developer", 10);
		listEmployeesWithIncrementedSalaries();
		listEmployeesGivenManager(emps.get(1));

	}

	private static void listEmployeesWithIncrementedSalaries() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Employees with incremented salaries are......");
		for(Employee e: emps) {
			if(e.isSalaryIncremented()==true) {
				System.out.println(e);
			}
		}
		
	}

	private static void listEmployeesGivenManager(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Employees under manager "+emp.getName()+" are.......");
		for(Employee e: emps) {
			if(e.getManager()==emp) {
				System.out.println(e);
			}
		}
	}

	private static void incrementManagerSalary(int percent) {
		// TODO Auto-generated method stub
		for(Employee e: emps) {
			if(e.getRole().getName().equals("Manager")) {
				e.setSalary(e.getSalary()+((e.getSalary()*percent)/100));
			}
		}
	}

	private static void incrementSalariesForEmployeesGivenRole(String role, int percent) {
		// TODO Auto-generated method stub
		if(role.equalsIgnoreCase("Manager")) {
			incrementManagerSalary(percent);
		}
		else {
			for(Employee e: emps) {
				if(e.getRole().getName().equalsIgnoreCase("Manager")) {
					e.incrementSalary(role, emps,percent);
				}
			}
		}
		
		System.out.println("Salaries Incremented for role: "+role);
	}

	private static void listEmployeesGivenRole(String role) {
		// TODO Auto-generated method stub
		for(Employee e: emps) {
			if(e.getRole().getName().equals(role)) {
				System.out.println("Employee with role as "+role+" is "+e);
			}
		}
		System.out.println();
	}

	private static void listEmployeeGivenDept(String dept) {
		// TODO Auto-generated method stub
		
		for(Employee e: emps) {
			if(e.getDept().getName().equals(dept)) {
				System.out.println("Employee belonging to "+dept+" is "+e);
			}
		}
		System.out.println();
	}

	private static void listAllEmployees() {
		// TODO Auto-generated method stub
		System.out.println("List of all Employees...\n");
		for(Employee e:emps) {
			System.out.println(e);
		}
		
		System.out.println();
		
	}

	private static void generateEmployees() {
		// TODO Auto-generated method stub
		
		Role[] roles = generateRoles();
		Department[] depts  =generateDepartments();
		emps = new ArrayList<>();
		
		Employee e1 = new Employee("Emp1",1,10000,roles[0],depts[0],null);
		Employee e2 = new Employee("Emp2",2,10000,roles[0],depts[1],null);
		Employee e3 = new Employee("Emp3",3,10000,roles[1],depts[2],e2);
		Employee e4 = new Employee("Emp4",4,10000,roles[1],depts[3],e1);
		Employee e5 = new Employee("Emp5",5,10000,roles[2],depts[0],e2);
		Employee e6 = new Employee("Emp6",6,10000,roles[2],depts[1],e1);
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		
		System.out.println("Employees generated.............");
		System.out.println("");
		
	}

	private static Department[] generateDepartments() {
		// TODO Auto-generated method stub
		Department[] depts = new Department[4];
		depts[0] = new Department("Dept1","Hyderabad");
		depts[1] = new Department("Dept2","Bengaluru");
		depts[2] = new Department("Dept3","Chennai");
		depts[3] = new Department("Dept4","Mumbai");
		return depts;
	}

	private static Role[] generateRoles() {
		// TODO Auto-generated method stub
		Role[] roles = new Role[3];
		roles[0] = new Role("Manager");
		roles[1] = new Role("Developer");
		roles[2] = new Role("Tester");
		return roles;
	}

}
