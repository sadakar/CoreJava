package test;

import java.util.*;

public class FindDuplicatesInArrayList {

	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,20,30,10,40));
		System.out.println("List:"+list);
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> dupEle = new ArrayList<>();
		for(Integer i: list) {
			if(! set.add(i)) {
				dupEle.add(i);
			}
		}
		System.out.println(set);
		System.out.println("Dup elements:"+dupEle);
	}
}
