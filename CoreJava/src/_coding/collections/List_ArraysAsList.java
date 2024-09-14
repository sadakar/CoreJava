package _coding.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_ArraysAsList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Sadakar","hasini","robert"));

        // Print list without any loops
        System.out.println("Print list -- without any loop:"+list);
        // Print list with iterator
        System.out.println("Print list -- using Iterator");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Print list -- using for each loop
        System.out.println("Print list -- using for each loop");
        for(String str : list){
            System.out.println(str);
        }

        // Print list -- regular for loop
        System.out.println("Print list -- using regular for loop");
        for(int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
    }
}
