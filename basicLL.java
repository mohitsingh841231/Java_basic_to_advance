public class basicLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(16);
        // System.out.println(x.next);
        a.next =b;
        b.next = c;
        c.next =d;
        d.next = e;

    }
    public static void display(){
        Node head;
        Node i = head;
        while(i.next !=null){
            i= i.next;
            System.out.println(i.data);
        }
    }
}
