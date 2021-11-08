package test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {
	public static void main(String[] args) {
		List<Integer> NumbsList = new ArrayList<>();
		List<String> names = new ArrayList<>();
		
		names.add("Lucy");
		names.add("John");
		
		System.out.println(names);
		System.out.println(names.get(2));
		names.set(0, "jack");
		System.out.println(names);
//		System.out.println(names.size);
	}

}
