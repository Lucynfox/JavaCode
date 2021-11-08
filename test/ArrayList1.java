package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List<Integer> listOfThings = new ArrayList<>();
		listOfThings.add(5);
//		System.out.println(listOfThings);
		listOfThings.add(2);
		listOfThings.add(6);
		listOfThings.add(8);
		listOfThings.add(9);
//		System.out.println(listOfThings);
		
//		for (int num : listOfThings) {
//			System.out.println(num);
//		}
//		
//		for(int i=0; i<listOfThings.size(); i++) {
//			System.out.println(listOfThings.get(i));
//		}
//		
		System.out.println(listOfThings.get(2));
		System.out.println(listOfThings.set(0,1));
		
		System.out.println(listOfThings);
		listOfThings.remove(0);
		System.out.println(listOfThings);
		Collections.sort(listOfThings);
		System.out.println(listOfThings);
		Collections.reverse(listOfThings);
		System.out.println(listOfThings);
		Collections.swap(listOfThings, 0, 3);

	}

}
