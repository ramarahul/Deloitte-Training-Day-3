import java.util.Scanner;

public class NumberGuess {
	
	private static int target =((int)(Math.random()*100))+1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(target);
		play();

	}
	
	@SuppressWarnings("resource")
	public static int getInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void play() {
		int attempts=5;
		while(attempts-->0) {
		int input = getInput();
		if(input == target) {
			System.out.println("Correct!");
			System.exit(0);
		}
		else {
			System.out.println("Try again...");
		}
		}
	}

}
