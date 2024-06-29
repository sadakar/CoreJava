package test;

import java.util.Arrays;
import java.util.*;
public class ReverseArrayList {

	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,30,2,55,90));
		System.out.println(list);
		
		List<Integer> revList = new ArrayList<Integer>();
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(revList.add(list.get(i)));
		}
		System.out.println(revList);
	}
}
