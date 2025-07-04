import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node{
        int data;
        Node Left;
        Node right;


    Node(int data){
        this.data = data;
        this.Left = null;
        this.right = null;
    }

    }

    public static class InnerBinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
          idx++;
          if(nodes[idx] == -1){
            return null;
          }
          Node newNode = new Node(nodes[idx]);
          newNode.Left = buildTree(nodes);
          newNode.right = buildTree(nodes);
          return newNode;
          
        }
        
    }
    

    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.Left);
        Preorder(root.right);
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.Left);
        System.out.print(root.data+" ");
        Inorder( root.right);
    }

    public static void Postorder(Node root){
         if(root == null) return;
         Postorder(root.Left);
         Postorder(root.right);
         System.out.print(root.data+" ");
    }

    public static void LevelOrder(Node root){
        if(root ==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currNode  = queue.remove();
            if(currNode == null){
              System.out.println();
              if(queue.isEmpty()){
                break;
              }
              else{
                queue.add(null);
              }
            }else{
              System.out.print(currNode.data+" ");
              if(currNode.Left!=null){
                queue.add(currNode.Left);
              }
              if(currNode.right!=null){
                queue.add( currNode.right);
              }
            }
        }
    }


  

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        InnerBinaryTree tree = new InnerBinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println();
        Preorder(root);
        System.out.println("Preorder");
        Inorder(root);
        System.out.println("Inorder");
        Postorder(root);
        System.out.println("Postorder");
    }

}

