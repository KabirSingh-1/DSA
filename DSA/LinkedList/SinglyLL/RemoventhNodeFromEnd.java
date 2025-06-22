package SinglyLL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemoventhNodeFromEnd {

    Node head;
    void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // optimal

    public static Node RemoventhNodeOptimal(Node head,int n){
        Node slow = head;
        Node fast = head;

        for(int i = 0; i<n;i++){
            fast = fast.next;

        }

    
        if(fast == null) return head.next;
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;

        }
        Node delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;
    }

    //best
    public static Node RemoventhNode(Node head, int n){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count == n){
            Node NewHead = head.next;
            head = null;
            return NewHead;
        }
        int res = count-n;

        temp = head;
        while(temp!=null){
           res--;
           if(res == 0){
            break;
           }
           temp = temp.next;
        }
        Node delNode = temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;
    }


    public static void main(String[] args) {

        RemoventhNodeFromEnd list = new RemoventhNodeFromEnd();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.print(list.head);
        int n = 2;
        list.head = RemoventhNode(list.head, n);
        list.print(list.head);
        list.head = RemoventhNodeOptimal(list.head,n);
        list.print(list.head);
    }
}
