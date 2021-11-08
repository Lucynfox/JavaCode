package test;

public class Palandrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("abcddcba"));
		
	}

	private static boolean isPalindrome(String word) {
		// TODO Auto-generated method stub
		int firstCharIdx = 0;
		int lastCharIdx = word.length() -1;
		while(firstCharIdx <= lastCharIdx) {
			if (word.charAt(firstCharIdx) != word.charAt(lastCharIdx)) {
				return false;
			}
			firstCharIdx += 1;
			lastCharIdx -=1;
		
		} return true;
	
	}

}
