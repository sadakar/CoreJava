package _coding.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(" World");
        System.out.println("String Builder String:"+stringBuilder);
    }
}
