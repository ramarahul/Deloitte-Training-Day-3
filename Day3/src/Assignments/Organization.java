package Assignments;

public class Organization {
	
	public static Employee[] emps = new Employee[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department hr = new Department("Hyderabad","HR");
		Department dev = new Department("Bengaluru","Dev");
		Department test = new Department("Chennai","Test");
		
		Address add1 = new Address(1,"Street1","Hyderabad","Telangana");
		Address add2 = new Address(1,"Street2","Hyderabad","Telangana");
		Address add3 = new Address(1,"Street3","Hyderabad","Telangana");
		Address add4 = new Address(1,"Street4","Hyderabad","Telangana");
		Address add5 = new Address(1,"Street5","Hyderabad","Telangana");
		
		Employee e1 = new Employee("Emp1",add1,1,hr);
		Employee e2 = new Employee("Emp2",add2,2,dev);
		Employee e3 = new Employee("Emp3",add3,3,dev);
		Employee e4 = new Employee("Emp4",add4,4,dev);
		Employee e5 = new Employee("Emp5",add5,5,null);
		
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		emps[3] = e4;
		emps[4] = e5;
		
		printEmployees("Dev");
		printDept(e1);
		noDeptEmployees();
		
		
	}
	
	public static void printEmployees(String d) {
		
		for(int i=0;i<5;i++) {
			if(emps[i].getDept()!=null&&emps[i].getDept().getName().equals(d)) {
				System.out.println(emps[i]);
			}
		}
		
	}
	
	public static void printDept(Employee e) {
		System.out.println(e.getDept().getName());
	}
	
	public static void noDeptEmployees() {
		for(int i=0;i<5;i++) {
			if(emps[i].getDept()==null) {
				System.out.println(emps[i]);
			}
		}
	}

}
