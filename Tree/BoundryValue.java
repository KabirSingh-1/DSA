import java.util.LinkedList;
import java.util.Queue;

public class BoundryValue {

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

    public static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
          Node newNode = new Node(nodes[idx]);
          newNode.left = buildTree(nodes);
          newNode.right = buildTree(nodes);
          return newNode;
        }
       
    }

public static void boundry(Node root){
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
 // left boundry
    if()
}
    
    public static void main(String[] args) {
        
    }
}
