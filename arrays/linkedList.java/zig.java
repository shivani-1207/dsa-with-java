public class zig {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        private Node head;
        private Node tail;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void ZigZag() {
            if (head == null || head.next == null) {
                return;
            }

            // Find mid
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            // Reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Alt merge - zigzag merge
            Node left = head;
            Node right = prev;
            Node nextL, nextR;

            while (left != null && right != null) {
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        
        ll.print(); // Prints: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ll.ZigZag();
        ll.print(); // Prints: 1 -> 5 -> 2 -> 4 -> 3 -> null
    }
}


