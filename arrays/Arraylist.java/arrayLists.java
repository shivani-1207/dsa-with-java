import java.util.ArrayList;
public class arrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1); // o(1)
        list.add(2);
        list.add(3);
        list.add(4);

//     System.out.println(list);
//     //get operation  o(1)
//     int element = list.get(2);
//     System.out.println(element);
    
//     //remove element o(n)
//     int rem = list.remove(3);
//     System.out.println(list);
//     System.out.println(rem);
//     list.add(5);
//     list.add(6);
//     list.add(7);
//     System.out.println(list);
//   // set element 
//     list.set(3,4);
//     System.out.println(list);

    
//     System.out.println(list.contains(4));
    
    
    
//     list.add(0, 10);   //0(n)
//     System.out.println(list);
//     System.out.println(list.size());

//     //print arraylist
//     for(int i=0; i<list.size(); i++){
//         System.out.print(list.get(i) + " ");

//         System.out.println();
// reverse arraylist  0(n)
    for(int j= list.size()-1; j>=0; j--){
        System.out.print(list.get(j)+ " ");
    }    
     
    }
}
    
    

