package objectOriented;

public class Student {
	
	private String name;
	private long rollNumber;
	
	public Student(String name,long rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return name+" : "+rollNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
