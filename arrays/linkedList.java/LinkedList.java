public class LinkedList {
    public static class Node{
        int data;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //create a newNode = step1
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step2 newNode's next = head
        newNode.next = head; // link
         
        //step 3 head = newnode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;//palindrome   otherswisw null
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){ //o(n)
        if(head == null){
            System.out.println("ll is empty");
        return;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data){
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
     while(i< idx-1){
        temp = temp.next;
        i++;
     }   
     // i=idx-1 temp=> prev
     newNode.next =temp.next;
     temp.next = newNode;
    }
    public int removeFirst(){
        if(size ==0){
            System.out.println("ll is empty");
            return  Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

            
        }
        int val =head.data;
        head = head.next;
         size--;
        return val;
     
    }
    public int removeLast(){
        if(size ==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size ==1){
             int val = head.data;
             head = tail = null;
             size =0;
             return val;
        }
        //prev  i = size-2;
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail data
        prev.next = null;
        tail =prev;
        size--;
        return val;
    }
    public int itrSearch(int key){ //o(n)
        Node temp = head;
        int i =0;
        while(temp!= null){
            if(temp.data == key){ // found
               return i;
            }
            temp = temp.next;
            i++;
        }
        //not found
        return -1;
    }
    public int helper(Node head , int key){//o(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }
    
    public void reverse(){ // o(nm)
        Node prev = null;
        Node curr = tail =head ;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

     public void deleteNthfromEnd(int n){
        // calculate size
        int sz =0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // removefirst
            return;
        }
        //sz-n 
        int i = 1;
        int iToFind = size-n;
        Node prev = head;
        while(i < iToFind){
           prev = prev.next;
           i++;
        }
        prev.next = prev.next.next;
        return;
     }
//slow fast approach
     public Node findMid(Node head){
        Node slow =head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
     }
     public boolean checkPalindrome(){
        if(head ==null || head.next ==null){
            return true;
        }
        //step 1 find mid
        Node midNode =findMid(head);

        // step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr =next;
        }
        Node right = prev; // right half head 
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
     }


    //methods 
    // add();
    // remove();
    // search();
    // print();
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
          ll.addLast(1);
          ll.addLast(2);
          ll.addLast(2);
          ll.addLast(1);
         
          ll.print();
          System.out.println(ll.checkPalindrome());
        // ll.print();
        //  ll.addFirst(2);
        //  ll.print();
        //  ll.addFirst(1);
        //  ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.add(2,9);
        // ll.print();
        // System.out.println(ll.size);
        // ll.deleteNthfromEnd(2);
        // ll.print();
        // ll.reverse();
        // ll.print();
        // ll.removeFirst();
        
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.recSearch(9));
         
    }
}
