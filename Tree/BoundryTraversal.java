import java.util.ArrayList;

public class BoundryTraversal {
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

    public static class binaryTree{
        static int idx = -1;
        static Node build(int nodes[]){
            idx++;
            if(nodes[idx] == -1) return null;
            Node currNode = new Node(nodes[idx]);
            currNode.left = build(nodes);
            currNode.right = build(nodes);
            return currNode;
        }
    }
    static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }
    static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.left;
        while (cur != null) {
            if (!isLeaf(cur)) res.add(cur.data);
            cur = (cur.left != null) ? cur.left : cur.right;
        }
    }
    static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while (cur != null) {
            if (!isLeaf(cur)) tmp.add(cur.data);
            cur = (cur.right != null) ? cur.right : cur.left;
        }
        for (int i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }
    static void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }
    public static ArrayList<Integer> boundry(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        if (!isLeaf(root)) ans.add(root.data);
        addLeftBoundary(root, ans);
        addLeaves(root, ans);
        addRightBoundary(root, ans);

        return ans;

    }

   public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binaryTree tree = new binaryTree();
    Node root = tree.build(nodes);
    System.out.println(root.data);
    System.out.println(boundry(root));
    
   } 
}
