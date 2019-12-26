package objectOriented;

public class Course {
	
	private String subject1;
	private String subject2;
	private Student[] students;
	private int index;
	private int limit=6;
	private static Course[] courses = new Course[2];
	int numCourses=0;
	
	public Course(String subject1,String subject2,int noOfStudents) {
		this.subject1 = subject1;
		this.subject2 = subject2;
		students = new Student[noOfStudents];
		index=0;
		
	}
	
	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	
	public void addCourse(Course c) {
		if(numCourses<limit) {
			courses[numCourses++] = c;
		}
	}
	
	public void addStudent(Student s) {
		if(index<students.length&&index<limit)
		students[index++] = s;
		else if(index>=limit) {
			System.out.println("Course is filled!");
		}
	}
	
	public void display() {
		if(index<3) {
			System.out.println("Not enough Students");
		}
		else {
		for(Student s: students) {
			System.out.println(subject1+" "+subject2+" "+s);
		}
		}
	}
	
	public static void printStudentNames(String subject) {
		for(Course c: courses) {
			if(c.getSubject1().equalsIgnoreCase(subject)|| c.getSubject2().equalsIgnoreCase(subject)) {
				Student[] students = c.getStudentsArray();
				for(Student s : students) {
					System.out.println(s.toString());
				}
			}
		}
	}

	private Student[] getStudentsArray() {
		// TODO Auto-generated method stub
		return students;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course phys = new Course("mechanics","wave theory",4);
		Course course2 = new Course("subj3","subj4",6);
		Student s1 = new Student("s1",1);
		Student s2 = new Student("s2",2);
		Student s3 = new Student("s3",3);
		Student s4 = new Student("s4",4);
		Student s5 = new Student("s5",5);
		Student s6 = new Student("s6",6);
		Student s7 = new Student("s7",7);
		Student s8 = new Student("s8",8);
		Student s9 = new Student("s9",9);
		Student s10 = new Student("s10",10);
		Student s11 = new Student("s11",11);
		phys.addStudent(s1);
		phys.addStudent(s2);
		phys.addStudent(s3);
		phys.addStudent(s4);
		course2.addStudent(s5);
		course2.addStudent(s6);
		course2.addStudent(s7);
		course2.addStudent(s8);
		course2.addStudent(s9);
		course2.addStudent(s10);
		course2.addStudent(s11);
		
		phys.display();
		course2.display();
		courses[0]=phys;
		courses[1]=course2;
		
		printStudentNames("Wave theory");
		
		
		
		
	}

}
