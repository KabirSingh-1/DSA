
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DesignLinkedList {
    Node head;  
      public DesignLinkedList() {
        this.head = null;
    
    }
    public int get(int index) {
       Node temp = head;
       int count = 0;
       while (temp!=null) {
        if(count == index) break;
        temp = temp.next;
        count++;
       }
       return (temp != null)? temp.data:-1;
    }
    public void addAtHead(int val) {
        
    }
    public void addAtTail(int val) {
        
    }

    public void addAtIndex(int index, int val) {
        
    }
    public void deleteAtIndex(int index) {

    }
  
    public static void main(String[] args) {
        DesignLinkedList obj = new DesignLinkedList();
        
    }
}
