import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        System.out.println(list+"  "+list.size());
        list.add(60);
        System.out.println(list+" "+list.size());
        list.add(40);
          System.out.println(list+" "+list.size());
        list.add(408);
          System.out.println(list+" "+list.size());
        list.add(70);
        System.out.println(list+" "+list.size());
        list.remove(1);
        System.out.println(list+" "+list.size());
    }
    
}
