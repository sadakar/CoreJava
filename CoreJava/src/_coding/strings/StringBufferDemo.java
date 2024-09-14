package _coding.strings;

public class StringBufferDemo {

    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(" World");
        System.out.println("String Buffer string:"+stringBuffer);
    }
}
