import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class RightView {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
    }
public static ArrayList<Integer> rightView(Node root) {
    ArrayList<Integer> result = new ArrayList<>();
    if(root == null) return result;
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        int Size = queue.size();
        for(int i = 0; i < Size; i++){
            Node curr = queue.poll();
            if(i == Size-1) result.add(curr.data);
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
    }
    return result;
}
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        System.out.println(rightView(root));
    }
}
