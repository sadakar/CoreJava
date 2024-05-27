package test;
import java.util.*;
public class ReverseAString {
	public static void main(String args[]) {
		
		String str="Reverse Me";
		
		int i=0;
		int j=str.length()-1;
		
		char revString[] = new char[j+1];
		
		while(i<=j) {
			revString[j]=str.charAt(i);
			revString[i]=str.charAt(j);
			i++;
			j--;
		}
		System.out.println(revString);
	}

}
