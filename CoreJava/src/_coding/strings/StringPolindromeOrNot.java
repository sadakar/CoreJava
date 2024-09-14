package _coding.strings;

public class StringPolindromeOrNot {

    public static void main(String[] args) {
        String str = "wew";
        String strRev = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(strRev)){
            System.out.println("String is polindrome");
        }else {
            System.out.println("String is not polindrome");
        }
    }
}
