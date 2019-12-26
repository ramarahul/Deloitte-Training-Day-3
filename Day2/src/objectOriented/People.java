package objectOriented;

public class People {
	
	private Person[] persons;
	int pers = 5;
	int counter = 0;
	
	public People() {
		persons  = new Person[pers]; 
	}
	
	public void addPerson(Person p) {
		if(counter < pers)
		persons[counter++] = p;
	}
	
	public void displayPersons() {
		for(Person p : persons) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People ppl = new People();
		Person amit = new Person("amit", 9876543210L);
		Person asha = new Person("asha", 9776538210L);
		Person rupa = new Person("rupa", 6655448811L);
		Person shah = new Person("shah", 6652431857L);
		Person nani = new Person("nani", 9452213587L);
		Person satya = new Person("satya", 9735242625L);
		ppl.addPerson(amit);
		ppl.addPerson(asha);
		ppl.addPerson(rupa);
		ppl.addPerson(shah);
		ppl.addPerson(nani);
		ppl.addPerson(satya);
		ppl.displayPersons();

	}

}
