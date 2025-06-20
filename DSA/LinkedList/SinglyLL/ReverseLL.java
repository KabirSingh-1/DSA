package SinglyLL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseLL {
    Node head;

    public void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node reverseLL(Node head){
        Node prev = null;
        Node temp = head;

        while(temp!=null){
            Node front = temp.next;
            temp.next  = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.print(list.head);
        list.head = list.reverseLL(list.head);
        list.print(list.head);
    }
}
