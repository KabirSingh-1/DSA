import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1)return null ;
            Node NewNode = new Node(nodes[idx]);
            NewNode.left = buildTree(nodes);
            NewNode.right = buildTree(nodes);
            return NewNode;
        }
    }

    public static void zigzag(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
    
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);
       
            while(size>0) {
               Node currNode = queue.poll();
               if(flag) level.add(currNode.data);
               else{
                level.add(0,currNode.data); // Insert at beginning to reverse the order
               } 
               if(currNode.left!=null) queue.add(currNode.left);
               if(currNode.right!=null)queue.add(currNode.right);
               size--;
            }

            for(int val : level){
                System.out.print(val+" ");
            }
            System.out.println();
            

         flag = !flag;
        
        }

    }
    public static void main(String[] args) {
        int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        zigzag(root);
    }
}
