package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>(); 
		// Vector is a thread-safe Collection
		
		v.add("ankit");
		v.add("Computer");
		v.add("laptop");
		v.add("mobile");
		
		System.out.println(v.size());
		
		int len = v.size();
		
		for(int i=0;i<len;i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println();
		
		for(String s: v) {
			System.out.println(s);
		}
		System.out.println();
		
		Enumeration<String> E = v.elements();
		
		while(E.hasMoreElements()) {
			System.out.println(E.nextElement());
		}
		System.out.println();
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(51);
		list.add(43);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		int sum=0;
		Iterator<Integer> ite = list.iterator();
		while(ite.hasNext()) {
			sum+=ite.next();
		}
		System.out.println(sum);
		System.out.println();
		
		
		Collections.sort(list);
		iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("akash",121));
		students.add(new Student("rahul",723));
		students.add(new Student("qwert",645));
		students.add(new Student("hahahaha",656));
		students.add(new Student("ohohohoho",155));
		students.add(new Student("asha",435));
		
		
		Iterator<Student> itera=students.iterator();
		while(itera.hasNext()) {
			System.out.println(itera.next().getName());
		}
		System.out.println();
		
		Collections.sort(students,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getRollNumber()-o2.getRollNumber();
			}
			
		});
		
		
		
		itera = students.iterator();
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}
		System.out.println();
		
		Collections.sort(students,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		
		
		itera = students.iterator();
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}
		System.out.println();
		
		Collections.sort(students,new StudentNameSorter());
		itera = students.iterator();
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}
		System.out.println();
		
		printNamesStartingWithA(students);
		System.out.println();
		
		int res=getRollNumber(students,"rahul");
		if(res==-1) {
			System.out.println("Not matching records");
		}
		else {
			System.out.println(res);
		}
		
		System.out.println();
		
		Hashtable<String,String> table =new Hashtable<>();
		table.put("admin","admin123");
		table.put("user","user123");
		
		Enumeration<String> enums = table.keys();
		while(enums.hasMoreElements()) {
			String key = enums.nextElement();
			String val = table.get(key);
			System.out.println(key+" : "+val);
		}

	}
	
	public static void printNamesStartingWithA(List<Student> students) {
		Iterator<Student> sdIt = students.iterator();
		while(sdIt.hasNext()) {
			Student s = sdIt.next();
			if(s.getName().startsWith("a")) {
				System.out.println(s);
			}
		}
	}
	
	public static int getRollNumber(List<Student>students,String name) {
		/*Iterator<Student> sdIt = students.iterator();
		while(sdIt.hasNext()) {
			Student s = sdIt.next();
			if(s.getName().equals(name)) {
				return s.getRollNumber();
			}
		}*/
		
		for(Student s: students) {
			if(s.getName().equalsIgnoreCase(name)) {
				return s.getRollNumber();
			}
		}
			
		
		return -1;
	}

}
