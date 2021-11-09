package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtraJavaExercisesPart4 {
	public static void main(String[] args) {

//		System.out.println(factorial(4));
		
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 11, 2, 9, 4, 5);
		
//		System.out.println(nthOddElement(arr, 4));
//		System.out.println(LinearSearch(arr, 3));
		System.out.println(FindMaximum(arr));
	
		
	}

	private static int FindMaximum(List<Integer> array) {
		// TODO Auto-generated method stub
		return Collections.max(array);
	}

	private static int LinearSearch(List<Integer> array, int num) {
		// TODO Auto-generated method stub
		return array.indexOf(num);
	}

	private static int nthOddElement(List<Integer> array, int nthOddNum) {
		// TODO Auto-generated method stub
		int oddNumCount = 0;
		int arrIdx = 0;
		while (arrIdx < array.size()) {
			if (array.get(arrIdx) % 2 == 1) {
				oddNumCount +=1;
				if(oddNumCount == nthOddNum) {
					return array.get(arrIdx);
				}
			}
			arrIdx += 1;
		}return -1;
		
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}

}
