package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VowelFinder {
	
	public static Map<String,Integer> map = new HashMap<>(); 
	public static List<String> wordList = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		takeInput();
		buildMap();
		vowelQuery();
		
	}
	
	private static void vowelQuery() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word to find number of vowels in it...");
		System.out.println("***Input 'quit' to terminate program***");
		String inp = s.nextLine();
		while(!inp.equalsIgnoreCase("quit")) {
			printVowelsFromMap(inp);
			inp = s.nextLine();
		}
		
	}

	private static void buildMap() {
		// TODO Auto-generated method stub
		for(int i=0;i<wordList.size();i++) {
			map.put(wordList.get(i),countNoOfVowels(wordList.get(i)));
		}
		
	}

	public static void takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word...");
		System.out.println("***Input 'quit' to stop building the map***");
		String input = s.nextLine();
		while(!input.equalsIgnoreCase("quit")) {
			buildList(input);
			input = s.nextLine();
		}
	}
	
	public static void buildList(String word) {
		wordList.add(word);
	}
	
	public static int countNoOfVowels(String word) {
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
				count++;
			}
		}
		
		return count;
	}
	
	public static void printVowelsFromMap(String word) {
		if(map.containsKey(word)) {
			System.out.println("No of vowels in "+word+" are:"+map.get(word));
		}
		else {
			System.out.println("Word not found");
		}
	}

}
