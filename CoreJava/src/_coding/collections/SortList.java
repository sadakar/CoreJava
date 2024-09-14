package _coding.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        // Prepare a list
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(0);

        // Print list without any loop
        System.out.println("List without any loop:"+list);

        // Sorting - Ascending order
        Collections.sort(list);
        System.out.println("Sorting - Ascending order:"+list);

        // Sorting - Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorting - Descending order:"+list);
    }
}
