package _coding.collections;

import java.util.*;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        // Prepare a list of elements
        List<String> list = new ArrayList<>(Arrays.asList("Sadakar","hasini","Sadakar","Robert"));
        System.out.println("List before removing duplicates:"+list);

        // Convert list to set and print to remove duplicates
        Set<String> set = new HashSet<>(list);
        System.out.println("List after removing duplicates:"+set);
    }
}
