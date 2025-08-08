package SinglyLL;

import java.util.Scanner;

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

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverseLL(Node head){
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
   public static Node buildList(int nums[]){
     Node dummy = new Node(0);
     Node temp = dummy;
     for(int num : nums){
        temp.next = new Node(num);
        temp = temp.next;
     }
     return dummy.next;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            }
        Node head = buildList(nums);
        print(head);
        head = reverseLL(head);
        print(head);
    }
}
