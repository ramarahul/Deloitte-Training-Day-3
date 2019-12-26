package objectOriented;

public class Person {
	
	private String name;
	
	private long mobileNumber;
	
	private static int numberOfInstances=0;
	
	//default, no-arg constructor
	public Person() {
		numberOfInstances++;
	}
	
	public Person(String name, long number) {
		this();
		this.name = name;
		mobileNumber = number;
	}
	
	public Person(String name) {
		this(name,0);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public int getInstances() {
		return numberOfInstances;
	}
	
	@Override
	public String toString() {
		return "Name= "+name+" : "+"Number= "+mobileNumber;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person neha = new Person(); // use new keyword to create one instance
		neha.setName("Neha mansukhani");
		neha.setMobileNumber(9234567890L);
		System.out.println(neha.getName());
		System.out.println(neha.getMobileNumber());
		
		Person harsha = new Person();
		harsha.setName("Harsha Bhogle");
		harsha.setMobileNumber(6578954387L);
		
		System.out.println(harsha.getName());
		System.out.println(harsha.getMobileNumber());
		
		System.out.println("Number of Instances = "+numberOfInstances);
		System.out.println(neha.toString());
		System.out.println(harsha);
		
		Person ramesh = new Person("Ramesh", 8771345620L);
		System.out.println(ramesh);
		
		Person amit = new Person("Amit");
		System.out.println(amit);
		
		Person[] persons  = new Person[4];
		persons[0] = neha;
		persons[1] = harsha;
		persons[2] = ramesh;
		persons[3] = amit;
		

	}

}
