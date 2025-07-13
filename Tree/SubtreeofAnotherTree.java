import javax.swing.tree.TreeNode;

public class SubtreeofAnotherTree {
    static class Node {
        int data;
        Node Left;
        Node right;

        Node(int data){
            this.data = data;
            this.Left = null;
            this.right =null;
        }
    }

    public static class BinaryTree{
        static int idx;
        public Node buillNode(int nodes[]){
            idx++;
            if(nodes[idx] == -1)return null;
            Node newNode = new Node(nodes[idx]);
            newNode.Left = buillNode(nodes);
            newNode.right = buillNode(nodes);
            return newNode;
        }
    

    }

    public static boolean isIdentity(Node root,Node Subroot){
      if(root == null && Subroot == null)return true;
      if(root == null || Subroot == null) return false;
      if(root.data !=Subroot.data) return false;
      return isIdentity(root.Left, Subroot.Left) && isIdentity(root.right, Subroot.right);
    }

    public static boolean isSubtree(Node root ,Node Subroot){
        if(Subroot == null)return true;
        if(root == null) return false;
        if(root.data == Subroot.data){
            if(isIdentity(root, Subroot)){
                return true;
            }

        }

        return isSubtree(root.Left, Subroot) || isSubtree(root.right, Subroot);

    }
    // same(identical) are same things 
    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.data != q.data) return false;
        return isSameTree(p.Left, q.Left) && isSameTree(p.right, q.right);
    }

    
    public static void main(String[] args) {

        int nodes[] = {3,4,1,-1,-1,2,-1,-1,5,-1,-1};
        int node[] = {4,1,-1,-1,2,-1,-1};
        BinaryTree tree = new BinaryTree();
        BinaryTree.idx =-1;
        Node root = tree.buillNode(nodes);
        System.out.println("root of root: "+root.data);
        BinaryTree.idx=-1;
        Node Subroot = tree.buillNode(node);
        System.out.println("root of Subroot: "+Subroot.data);

        System.out.println(isSubtree(root,Subroot));

        System.out.println(isSameTree(root,Subroot));

        
    }
}
