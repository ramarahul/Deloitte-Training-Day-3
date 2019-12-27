package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"rahul","qwerty","hello","pk","kalyan"};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Employee e1 = new Employee("ankit", 123, 100000);
		Employee e2  =new Employee("Rahul", 345, 200000);
		Employee e3 = new Employee("qwerty", 657,34562);
		
		Employee[] emps = new Employee[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		
		Arrays.sort(emps,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e2.getName().compareTo(e1.getName());
			}
			
		});
		
		for(int i=0;i<emps.length;i++) {
			System.out.println(emps[i]);
		}
		
		Arrays.sort(emps,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e2.getId()-e1.getId();
			}
			
		});
		
		for(int i=0;i<emps.length;i++) {
			System.out.println(emps[i]);
		}
		
		Arrays.sort(emps,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary()-o2.getSalary());
			}
			
		});
		
		for(int i=0;i<emps.length;i++) {
			System.out.println(emps[i]);
		}
		
	}

}
