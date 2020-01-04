
public class Solution {
	
	public static void main(String[] args) {
		String inp = "qwerty";
		inp = rev(inp);
		int noOfVowels=0;
		for(int i=0;i<inp.length();i++) {
			if(inp.charAt(i)=='a'||inp.charAt(i)=='e'||inp.charAt(i)=='i'||inp.charAt(i)=='o'||inp.charAt(i)=='u') {
				noOfVowels++;
			}
		}
		System.out.println("Reversed String is: "+inp);
		System.out.println("No of Vowels are: "+noOfVowels);
	}
	
	public static String rev(String inp ) {
		String ans="";
		
		for(int i=inp.length()-1;i>=0;i-- ) {
			ans+=inp.charAt(i);
		}
		return ans;
	}

}
