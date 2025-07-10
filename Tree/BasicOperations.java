public class BasicOperations {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left =  null;
            this.right = null;
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
  // count the number of nodes in a tree
    public static int Count(Node root){
       if(root == null)return 0;
       int leftCount = Count(root.left);
       int rightCount = Count(root.right);
       return leftCount+rightCount+1;
    }
   // find out the sum of the nodes of binary tree
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
     // find out the heigth of the tree
    public static int height(Node root){
        if(root == null)return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(leftHeight == -1 || rightHeight ==-1)return -1;
        if(Math.abs(leftHeight -rightHeight)>1)return -1;
        int MyHeight = Math.max(leftHeight, rightHeight)+1;
        return MyHeight;
    }
    //O(n^2)
    public static int diameter(Node root){
        if(root == null) return 0;
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = height(root.left)+height(root.right)+1;
        return Math.max(d3,Math.max(d1, d2));
    }
    // O(n)- optimal (find out the diameter of the tree)
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter1(Node root){
        if(root == null) return new TreeInfo(0,0);
         TreeInfo left = diameter1(root.left);
         TreeInfo right = diameter1(root.right);
         int maxHeight = Math.max(left.ht,right.ht)+1;
         int d1 = left.diam;
         int d2 =  right.diam;
         int d3 = left.ht+right.ht+1;
         int mydiam = Math.max(d3,Math.max(d2,d1));
        
         TreeInfo myInfo = new TreeInfo(maxHeight, mydiam);
         return myInfo;


    }


    // check the tree is balance binary tree or not 
    public static boolean balanceBinaryTree(Node root){
       return height(root)!=-1;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Total Nodes: " + Count(root));
        System.out.println("Total Sum Of Nodes: "+sumOfNodes(root));
        System.out.println("height of binary tree: "+height(root));
        System.out.println("diameter of root: "+diameter(root));

        System.out.println("diameter by otpimat approach: "+diameter1(root).diam);

        System.out.println("is balance binary tree : "+balanceBinaryTree(root));

    }
}
