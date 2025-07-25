
public class SymmetricTree {
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

    public static class binary{
        static int idx = -1;
        static Node buildTree(int[] nums){
            idx++;
      
                if(nums[idx] == -1) return null;
                Node currNode = new Node(nums[idx]);
                currNode.left = buildTree(nums);;
                currNode.right = buildTree(nums);

            
            return currNode;
        }


    }
    public static boolean isMirror(Node left, Node right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.data != right.data) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
    public static boolean isSymmetric(Node root){
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,-1,-1,4,-1,-1,2,4,-1,-1,3,-1,-1};
        Node root = binary.buildTree(nums);
        System.out.println(root.data);
        System.out.println(isSymmetric(root));
    }
}
