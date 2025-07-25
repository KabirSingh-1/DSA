import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopVIew {
   static class Node {
      int data;
      Node left;
      Node right;
      Node(int data){
         this.data = data;
         this.left = null;
         this.right = null;
      }
   }
   static class pair{
      Node node;
      int count;
      pair(Node node,int count){
         this.node = node;
         this.count = count;
      }
   }
    static class BinaryTree{
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
public static ArrayList<Integer> level(Node root){
   ArrayList<Integer> list = new ArrayList<>();
   if(root == null){ return list;}
   Queue<pair> queue = new LinkedList<>();
   queue.add(new pair(root,0));
   HashMap<Integer ,Integer> map = new HashMap<>();
   while(!queue.isEmpty()){       
         pair curr = queue.poll();
         Node node = curr.node;
         int hd = curr.count;
         if(!map.containsKey(hd)){
            map.put(hd,node.data);
         }
         if(node.left!=null){
            queue.add(new pair(node.left, hd-1));
         }
         if(node.right!=null){
            queue.add(new pair(node.right, hd+1));
         }
      }
      for(int nodes : map.values()){
         list.add(nodes);  
      }
   return list;
}
   public static void main(String[] args) {
     int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BinaryTree tree = new BinaryTree();
     Node root = tree.buildTree(nodes);
     System.out.println("root: "+root.data);
     System.out.println("level order traversal");
     System.out.println(level(root));
   } 
}
