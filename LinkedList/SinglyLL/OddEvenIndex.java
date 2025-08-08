package SinglyLL;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class OddEvenIndex {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node buildList(int nums[]){
        Node dummy = new Node(0);
        Node temp = dummy;
        for(int num : nums){
            temp.next = new Node(num);
            temp = temp.next;
        }
        return dummy.next;
    }
    static void print(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
    static Node oddEven(Node head){
        Node oddHead = new Node(0);
        Node evenHead = new Node(0);
        Node odd = oddHead;
        Node even = evenHead;
        int count = 1;
        while(head!=null){
            if(count%2!=0){
                odd.next = head;
                odd = odd.next;
            }
            else{
                even.next = head;
                even = even.next;
            }
            head = head.next;
            count++;
            
        }
        even.next = null;
        odd.next = evenHead.next;
        return oddHead.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter the elements of the list");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Node head = buildList(nums);
        System.out.println("Original List:");
        print(head);
        System.out.println();
        Node head1 = oddEven(head);
        print(head1);
    }
}
