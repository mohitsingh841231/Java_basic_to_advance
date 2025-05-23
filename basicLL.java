public class basicLL {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void rec(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        rec(head.next);
    }
    public static void rec1(Node head){
        if(head == null)return ;
        rec1(head.next);
        System.out.println(head.data);
    }
    public static void nthNodeFromLast(Node head,int nthFromLast){
        int length =0;
        int count =0;
        Node i,j;
        Node temp =head;
        

        while(temp.next!=null){
            length++;
            temp = temp.next;

        }
        System.out.println(length);
        int nth = length - nthFromLast+1;
        i = head;
        j = head.next;

        while(j.next !=null && count != nth){
            count++;
            i = i.next;
            j = j.next;
        }
        i.next = j.next;
        j = j.next;
        

       
    }
   public static void display(Node head){
    Node temp = head;
    while(temp.next !=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
   }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node head =a;
        Node temp = head;

        while (temp.next!= null) {  // Fix: include the head element as well
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("\nRecursive Traversal:");
        // rec(head);  // Calling the recursive function
        System.out.println("reverse");
        // rec1(head);
        System.out.println("count");
        System.out.println("new linklist");
        nthNodeFromLast(head,3);
        display(head);
    }
}
