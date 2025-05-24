// public class merge2List {

//     // Make the node class static so it can be used inside static main method
//     public static class node {
//         int data;
//         node next;

//         node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {
//         node a = new node(10);
//         node b = new node(12);
//         node c = new node(12);
//         node d = new node(12);
//         node e = new node(12);
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         node a1 = new node(2);
//         node b1 = new node(2);
//         node c1 = new node(2);
//         node d1 = new node(2);
//         node e1 = new node(2);
//         a1.next = b1;
//         b1.next = c1;
//         c1.next =d1;
//         d1.next = e1;

//         node temp1 = a;
//         node temp2 = a1;
//         while (temp1 != null && temp2 != null) {
            
//             int sum = temp1.data + temp2.data;
//              if(temp1.data>9 && temp2.data>9){
//                 temp1.next.data = temp1.data%10;
//                 temp2.next.data= temp2.data%10;
//             }
//             System.out.print(sum + " ");
//             temp1 = temp1.next;
//             temp2 = temp2.next;
           
//         }

//     }
// }
public class merge2List {

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // l1 = 2 -> 3 -> 4 -> 5 -> 1
        node l1 = new node(2);
        l1.next = new node(3);
        l1.next.next = new node(4);
        l1.next.next.next = new node(5);
        l1.next.next.next.next = new node(1);

        // l2 = 5 -> 3 -> 6 -> 4 -> 2
        node l2 = new node(5);
        l2.next = new node(3);
        l2.next.next = new node(6);
        l2.next.next.next = new node(4);
        l2.next.next.next.next = new node(2);

        node result = addLists(l1, l2);
        printList(result);  // Expected Output: 7 6 0 0 4
    }

    // Adds two reversed linked lists
    public static node addLists(node l1, node l2) {
        node dummy = new node(0);
        node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new node(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    // Utility method to print a linked list
    public static void printList(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
6