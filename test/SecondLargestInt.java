package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestInt {
	public static void main(String[] args) {
//		SecondLargestInt();
		List<Integer> listOfNumbs = new ArrayList<>();
		Collections.addAll(listOfNumbs, 1, 2, 9, 4, 5);
		System.out.println(SecondLargestReverse(listOfNumbs));
		
	}

	private static int SecondLargestReverse(List<Integer> listOfNumbs) {
		// TODO Auto-generated method stub
		Collections.sort(listOfNumbs);
		Collections.reverse(listOfNumbs);
		int secondLargestNum = listOfNumbs.get(1);
		return secondLargestNum;
	}

}
