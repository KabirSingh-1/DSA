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

    public  void addFirst(int data){
      Node NewNode = new Node(0);

      if(Head == null){
        Head = NewNode;
        return;
      }

      NewNode.next = Head;
      Head = NewNode;
    }
    
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

    public void deleteFirst(){
        if(Head == null){
            return;
        }
        Head = Head.next;
    }

    public void deleteEnd(){
        if(Head == null) return;
        Node temp = Head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
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
    }
}
