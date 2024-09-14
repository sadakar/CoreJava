package _coding.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseAList {
    public static void main(String[] args) {

        // Prepare a list of elements
        List<String> list = new ArrayList<>();
        list.add("Sadakar");
        list.add("Hasini");
        list.add("Robert");
        list.add("Vinitha");
        list.add("Raju");

        // Print list of elements using Iterator
        System.out.println("Actual list -- using Iterator");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println("\n");
        // Reverse the list -- using for each loop
        List<String> reverseList = new ArrayList<String>();
        for(String l :list){
            reverseList.add(0,l);
        }
        System.out.println("Reverse list -- using for each loop:"+reverseList);

        // Reverse the list -- using regular for loop
        System.out.println("Reverse list -- using regular for loop");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(" "+list.get(i));
        }
    }
}
