package _coding.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountStringsStartWithB {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(Arrays.asList("Dog","bombay","Cat","Banana","Brokli","Apple"));
        System.out.println("Given List:"+list);
        int count=0;
        for(String s : list){
            if(s.startsWith("B")) {
                count++;
                System.out.print(" "+s);
            }
        }
        System.out.println("\n Count of string literals starts with B are:"+count);
    }
}


