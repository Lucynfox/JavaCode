package test;

public class StringManipulation {
	public static void main(String[] args) {
		String myStr = "I like strings.";
		String myStr2 = "I like strings.";
		String myStr3 = new String("I like strings");
		System.out.println(myStr.equals(myStr3)); // should compare strings using this method.
	}

}
