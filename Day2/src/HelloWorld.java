
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hello = "Hello, Java world!";
		System.out.println(hello);
		int len = hello.length();
		System.out.println("The no. of chars in the text = "+len);
		System.out.println("Is this true: "+(len==18));
		
		if(len == 10) {
			System.out.println("That is correct!");
		}
		else {
			System.out.println("Wrong! Try again");
		}
		
		System.out.println((len == 18)?"Correct":"Wrong");
		
		int m = 34, n = 45;
		
		System.out.println(m * n);
		
		if(m < n) {
			System.out.println(n - m);
		}
		else {
			System.out.println(m - n);
		}
		
		for(int i = 0; i < len; i++) {
			System.out.print(i + " ");
		}
		
		double amount = 123;
		
		System.out.println(amount / 0);
		
		@SuppressWarnings("unused")
		int num = (int) 23.45;
		
		char ch = 'A';
		
		System.out.println((int)ch);
		
		// Convert all alphabets and digits to ASCII
		while(ch<='Z') {
			System.out.println(ch+" "+(int)ch++);
		}
		
		char chl = 'a';
		
		while(chl<='z') {
			System.out.println(chl+" "+(int)chl++);
		}
		
		char chn = '0';
		
		while(chn<='9') {
			System.out.println(chn+" "+(int)chn++);
		}
		
		rangeSum(5,10);
		
		calculate(5,0,"/");

	}
	
	//Method to find sum given a range of numbers
	public static void rangeSum(int m, int n) {
		if(m > n) { 
			swap(m,n);
		}
		else {
		int ans = 0;
		for(int i=m;i<=n;i++) {
			ans+=i;
		}
		
		System.out.println("The sum of range "+m+" to "+n+" is "+ans);
		}
	}
	
	//Helper method of rangeSum
	public static void swap(int m, int n) {
		rangeSum(n,m);
	}
	
	//Add two integers
	public static int add(int k ,int m) {
		return k+m;
	}
	
	//Perform arithmetic operation on two numbers
	public static void calculate(double a, double b, String op) {
		op.trim();
		char ch = op.charAt(0);
		double ans=0;
		switch(ch) {
		case '+':
			ans = a+b;
			break;
		case '-':
			ans = a-b;
			break;
		case '*':
			ans = a*b;
			break;
		case '/':
			if(b==0)System.out.println("The denominator cannot be zero");
			else
			ans = a/b;
			break;
		default:
			System.out.println("Invalid input");
			b=0;
		
		}
		
		if(ch=='/'&&b==0) {}
		else 
		System.out.println(a+" "+ch+" "+b+" is: "+ans);
	}
	

}
