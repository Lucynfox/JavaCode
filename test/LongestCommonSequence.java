package test;

public class LongestCommonSequence {
	public static void main(String[] args) {
//		LongestCommonSequence("ihi", "hillo");
		System.out.println(LongestCommonSequence("ihi", "hillo"));
	}

	private static String LongestCommonSequence(String string1, String string2) {
		// TODO Auto-generated method stub
		String longestSubstring = "";
//		System.out.println(longestSubstring);
		for (int string1Idx=0;string1Idx<string1.length(); string1Idx++) {
			System.out.println("loop 1");
			for (int string2Idx=0; string2Idx<string2.length(); string2Idx++) {
//				System.out.println("loop 2");
//				System.out.println(string1.charAt(string1Idx));
//				System.out.println(string2.charAt(string2Idx));
		
				int isMatch = Character.compare(string1.charAt(string1Idx),(string2.charAt(string2Idx)));
				System.out.println(string1.charAt(string1Idx));
				System.out.println(string2.charAt(string2Idx));
				System.out.println(isMatch);
				if (isMatch == 0) {
					System.out.println("match");
					longestSubstring += string1.charAt(string1Idx);
					System.out.println(longestSubstring);
			}
			}
		} 
//		System.out.println(longestSubstring);
		return longestSubstring;
		
	}

}
