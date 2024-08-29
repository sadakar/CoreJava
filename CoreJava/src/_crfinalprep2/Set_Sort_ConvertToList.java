package _crfinalprep2;
import java.util.*;
import java.util.HashSet;

public class Set_Sort_ConvertToList {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Sadakar");
        names.add("Hasini");
        names.add("Benjuman");
        names.add("Anantha");

        // Before sorting the set
        System.out.println("Before sorting the set: "+names);

        // Set can not be sorted so convert it to list

        List<String> sortedNames = new LinkedList<String>(names);
        Collections.sort(sortedNames);
        // After sorting the list -- default is ascending order
        System.out.println("After sorting the set: -- default is ascending order"+ sortedNames);

        // descending order
        Collections.sort(sortedNames,Collections.reverseOrder());
        System.out.println("After sorting the set: -- descending order"+ sortedNames);
    }
}
