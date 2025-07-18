public class NextPointer {
    static class  Node{
        int data;
        Node left;
        Node right;
        Node next;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.next = null;
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

    public static Node NextP(Node root){
        
        return root;
    }

    public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binaryTree tree = new binaryTree();
    Node root = tree.build(nodes);
    System.out.println(root.data);
    }
}
