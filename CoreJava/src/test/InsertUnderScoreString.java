package test;

public class InsertUnderScoreString {

	public static void main(String args[]) {
		String str ="ThisIsBeautifulPlace";
		
		String str2 = str.replaceAll("([a-z])([A-Z])", "$1_$2");
		System.out.println(str2);
	}
}
