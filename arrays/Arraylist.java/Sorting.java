import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(10);
    list.add(9);
    list.add(6);
    list.add(12);
    System.out.println(list);
    Collections.sort(list); // ascending
    System.out.println(list);
     //descending
     Collections.sort(list,Collections.reverseOrder());
     System.out.println(list);
}
}