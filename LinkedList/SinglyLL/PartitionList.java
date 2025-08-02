package SinglyLL;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        Node next = null;
    }
}

public class PartitionList {
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
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    static Node partition(Node head,int pivot){
       Node lesshead = new Node(0);
       Node eqaulhead = new Node(0);
       Node greaterhead = new Node(0);
       Node less = lesshead;
       Node equal = eqaulhead;
       Node greater = greaterhead;

       while(head!=null){
        if(head.data<pivot){
            less.next = head;
            less = less.next;
        }
        else if(head.data == pivot){
            equal.next = head;
            equal = equal.next;
        }
        else{
            greater.next = head;
            greater = greater.next;
        }
        head = head.next;
       }

       greater.next = null;
       equal.next = greaterhead.next;
       less.next = eqaulhead.next;
       return lesshead.next;
    }

    // leetcode - 86
    static Node partitionList(Node head, int x) {
       Node lesshead = new Node(0);
       Node eqaulhead = new Node(0);
       Node less = lesshead;
       Node equal = eqaulhead;

       while(head!=null){
        if(head.data<x){
            less.next = head;
            less = less.next;
        }
        else{
            equal.next = head;
            equal = equal.next;
        }
        head = head.next;
       }

       equal.next = null;
       less.next = eqaulhead.next;
       return lesshead.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int pivot = sc.nextInt();
        int arr[] = nums.clone();
        Node head = buildList(nums);
        print(head);
        System.out.println();
        Node result  = partition(head, pivot);
        print(result);
        System.out.println();
        Node Head = buildList(arr);
        Node result1 = partitionList(Head, pivot);
        print(result1);
        
    }
}
