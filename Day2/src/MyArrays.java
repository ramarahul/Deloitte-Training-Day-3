import java.util.Random;

public class MyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration, memory allocation, initialization
		int[] nums = {12,21,23,43,44,54};
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]*nums[i]);
		}
		
		double[] amounts;         //declaration
		amounts = new double[5];  //memory allocation
		//initialization
		amounts[0] = 123.45;
		amounts[1] = 133.55;
		amounts[2] = 112.15;
		amounts[3] = 131.05;
		amounts[4] = 122.25;
		
		System.out.println(amounts[3]);
		
		String[] names = new String[3]; //declaration + memory allocation
		names[1] = "anand";
		System.out.println(names[0]);
		names[0] = "rahul";
		names[2] = "name";
		stringLengths(names);
		modArray(names);
		System.out.println(names[0]);
		sortInts(nums);
		
		Random rand = new Random();
		System.out.println(rand.nextInt(10));

	}
	
	public static void stringLengths(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Length of the String "+arr[i]+" is: "+arr[i].length());
		}
	}
	
	public static void modArray(String[] arr) {
		arr[0]="hahaha";
	}
	
	public static void sortInts(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		printInts(arr);
	}
	
	public static void printInts(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
