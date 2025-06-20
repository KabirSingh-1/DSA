package SinglyLL;
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data ;
        this.next =  null;
    }
}

public class SingleLL {
    Node Head;

     void printLL(Node Head){
        Node temp = Head;

        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

 // add at first
    public  void addFirst(int data){
      Node NewNode = new Node(0);

      if(Head == null){
        Head = NewNode;
        return;
      }

      NewNode.next = Head;
      Head = NewNode;
    }


 // add at last
    public void addLast(int data){
        Node NewNode = new Node(data);
        if(Head == null){
            Head = NewNode;
            return;
        }
        Node temp = Head;
        while(temp.next!=null){
            temp = temp.next;

        }
        temp.next = NewNode;
    }

 // add at a given position 
    public void addAtGivenPosition(int data, int position){
        Node NewNode = new Node(data);
        if(position == 1){
          
            NewNode.next = Head;
            Head = NewNode;
            return;
        }

        Node temp = Head;
        int i = 1;
        while(temp!=null && i<position-1){
           temp = temp.next;
           i++;
        }
        if(temp == null) return;
        NewNode.next = temp.next;
        temp.next = NewNode;
    }

 // delete first

    public void deleteFirst(){
        if(Head == null){
            return;
        }
        Head = Head.next;
    }
 // delete end
    public void deleteEnd(){
        if(Head == null) return;
        Node temp = Head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

 // delete a given key 
     public void deleteGivenKey(int key){
        if(Head == null && Head.next == null) return ;
        if(Head.data == key){
            Head = Head.next;
            return;
        }
        Node temp = Head;
        while(temp.next.data!=key){
            temp = temp.next;
        }
          if (temp.next != null) {
        temp.next = temp.next.next;
    }

    }

    public static void main(String[] args) {
       SingleLL list = new SingleLL();
       list.Head = new Node(1);
       list.Head.next = new Node(2);
       list.Head.next.next = new Node(3);
       list.Head.next.next.next = new Node(4);
       list.addFirst(0);
       list.addLast(5);
       list.printLL(list.Head);
       list.deleteFirst();
       list.printLL(list.Head);
       list.deleteEnd();
       list.printLL(list.Head);
       list.addAtGivenPosition(8, 3);
       list.printLL(list.Head);
       list.deleteGivenKey(8);
       list.printLL(list.Head);
     
    }
}
