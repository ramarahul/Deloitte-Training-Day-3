package strings;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		str = "This is a text.";
		String st = new String("This is a line of text");
		System.out.println(str==st);
		System.out.println(str.equals(st));
		str=st;
		System.out.println(str==st);
		System.out.println(str.equals(st));
		
		int len = str.length();
		
		int indexOfC = str.indexOf('t');
		System.out.println(indexOfC);
		
		int lastIndexOft = str.lastIndexOf('t');
		System.out.println(lastIndexOft);
		
		int count=0;
		for(char c : str.toCharArray()) {
			if(c == 't') {
				++count;
			}
		}
		
		System.out.println("t occurs "+count+" times.");
		
		System.out.println(str.substring(18,22));
		locate("text",str);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>");
		buffer.append("<head><title>My Web Page</title></head>");
		buffer.append("<body>");
		buffer.append("<h1>This is my web profile</h1>");
		buffer.append("</body></html>");
		
		System.out.println(buffer.toString());
		System.out.println(buffer.reverse());
		
		System.out.println(isPalindrome("aha"));
		System.out.println(isPalindrome("able was i ere i saw elba"));
		System.out.println(countNoOfAlphabets("The quick brown fox jumps over a lazy dog"));
		

	}
	
	public static void locate(String word, String line) {
		if(line.contains(word)) {
			int firstIndexOf = line.indexOf(word);
			int lastIndex = firstIndexOf+word.length()-1;
			System.out.println(firstIndexOf+" "+lastIndex);
			System.out.println(line.substring(firstIndexOf, lastIndex+1));
		}
		else {
			System.out.println("Word does not exist");
		}
	}
	
	public static boolean isPalindrome(String word) {
		StringBuffer buf = new StringBuffer(word);
		return buf.reverse().toString().equals(word);
	}
	
	public static int countNoOfAlphabets(String line) {
		System.out.println(line.length());
		line = line.toLowerCase();
		int[] arr = new int[26];
		int count=0;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)!=' ') {
				if(arr[line.charAt(i)-'a']==0) {
				arr[line.charAt(i)-'a']++;
				count++;
				}
			}
		}
		
		return count;
	}

}
