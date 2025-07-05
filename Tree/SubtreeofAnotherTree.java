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
        static int idx = -1;
        public Node buillNode(int nodes[]){
            idx++;
            if(nodes[idx] == -1)return null;
            Node newNode = new Node(nodes[idx]);
            newNode.Left = buillNode(nodes);
            newNode.right = buillNode(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {

        int nodes[] = {3,4,1,-1,-1,2,-1,-1,5,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buillNode(nodes);
        System.out.println(root.data);

        
    }
}
