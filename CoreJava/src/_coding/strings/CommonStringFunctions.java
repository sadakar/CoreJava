package _coding.strings;

public class CommonStringFunctions {

    public static void main(String[] args) {


        String str1 = "Hello World";
        String str2 = " HELLO WORLD";
        String str3 = " Java Programming  ";

        // 1. length() function -- Get the length of the string
        System.out.println("Length of str1:" + str1.length());

        // 2. charAt() -- Get the character at a specific index
        System.out.println("Character at index 1:" + str1.charAt(1));

        // 3. subString() -- Extract a sub string
        System.out.println("Substring from index 0 to 5:" + str1.substring(0, 5));

        //4. equals() -- compare two strings for equality
        System.out.println("str1 equals str2:" + str1.equals(str2));

        //5. equalsIgnoreCase()
        System.out.println("str1 eqauls str2 (ignore case):" + str1.equalsIgnoreCase(str2));

        //6. contains() -- check if string contains a sequence
        System.out.println("str1 contains 'World' ? " + str1.contains("World"));

        // 7. replace() - Replace a character sequence with another
        System.out.println("Replace 'World' with 'Java' in str1:" + str1.replace("World", "Java"));

        // 8. toUpperCase() -- Convert to upper case
        System.out.println("str1 to uppercase:" + str1.toUpperCase());

        // 9. toLowerCase() -- Convert to lower case
        System.out.println("str1 to lowercase:" + str1.toLowerCase());

        // 10. trim() -- Remove leading and trailing spaces
        System.out.println("str3 after trimming:" + str3.trim());

        // 11. indexOf() -- find the index a character or substring
        System.out.println("Index of 'World' in str1:" + str1.indexOf("World"));

        // 12. isEmpty() -- Check if the string is empty
        String emptyString = "";
        System.out.println("Is emptyString empty? : " + emptyString.isEmpty());

        // 13. split() -- Split the string into an array based on a delimiter
        String[] words = str1.split(" ");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println(word);
        }

        // 14. startsWith() -- check if the string starts with a specific prefix
        System.out.println("str1 starts with 'Hello'? : " + str1.startsWith("Hello"));

        // 15. endsWith() -- Check if the string ends with a specific suffix
        System.out.println("str1 ends with 'World'?:" + str1.endsWith("World"));
    }

}
