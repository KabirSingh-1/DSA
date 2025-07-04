public class BinaryTree {
    static class Node{
        int data;
        Node Left;
        Node right;


    Node(int data){
        this.data = data;
        this.Left = Left;
        this.right = right;
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
  

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        InnerBinaryTree tree = new InnerBinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }

}

