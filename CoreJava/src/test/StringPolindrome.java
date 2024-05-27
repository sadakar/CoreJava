package test;
import java.util.*;
public class StringPolindrome {

	public static void main(String args[]) {
		String str ="ada";
		int i=0;
		int j=str.length()-1;
		char revString[]= new char[j+1];
		
		while(i<=j) {
			revString[j]=str.charAt(i);
			revString[i]=str.charAt(j);
			i++;
			j--;
		}
		System.out.println(revString);
		
		String str2 = new String(revString);
		if(str.equals(str2)) {
			System.out.println("Polindrome");
		}else {
			System.out.println("Not polindrome");
		}
		
	}
}
