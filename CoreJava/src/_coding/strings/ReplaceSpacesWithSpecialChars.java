package _coding.strings;

public class ReplaceSpacesWithSpecialChars {
    public static void main(String[] args) {
        String str = "Replaces whitespaces with special characters";
        String specialChars = "$%^&";
        int spaceCount=0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){

            char currentChar = str.charAt(i);
            if(currentChar==' ') {
                stringBuilder.append(specialChars.charAt(spaceCount % specialChars.length()));
                spaceCount++;
            }else {
                stringBuilder.append(currentChar);
            }
        }
        System.out.println("Modified String:"+stringBuilder.toString());
    }
}
