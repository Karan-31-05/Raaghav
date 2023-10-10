package week1;

public class vowel {
public static void main(String args[]) {
	String myStr = "Hello World";
	myStr.toLowerCase();
	String regex = "['a'\\'e'\\'i'\\'o'\\'u']";
	String[] arr = myStr.split(regex);
	int count = -1;
	for (String s: arr) {
		count++;
	}
	System.out.println("Vowel count: " + count);
}
}
