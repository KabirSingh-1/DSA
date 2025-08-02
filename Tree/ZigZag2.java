import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZigZag2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    static Node build(int nums[]){
       int n = nums.length;
       if(n ==0) return null;
       Node NodeRoot = new Node(nums[0]);
       Queue<Node> q = new LinkedList<>();
       q.add(NodeRoot);
       int i = 1;
       while (i<n) {
        Node currNode = q.poll();
        if(i<n){
            currNode.left = new Node(nums[i++]);
            q.add(currNode.left);
        }
        if(i<n){
            currNode.right = new Node(nums[i++]);
            q.add(currNode.right);
        }
       }
       return NodeRoot;
    }
    static void zigzag(Node root){
       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       boolean leftTOright = true;
       while (!queue.isEmpty()) {
           int size = queue.size();
           int level[] = new int[size];
           for( int i = 0; i<size; i++){
            Node curNode = queue.poll();
            int index = leftTOright?i:size-1-i;
            level[index] = curNode.data;
            if(curNode.left!=null) queue.add(curNode.left);
            if(curNode.right!=null) queue.add(curNode.right);
           }
           for(int val : level){
            System.out.print(val+" ");
           }
           leftTOright= !leftTOright;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = sc.nextInt();
        int nums[] = new int[n];
        nums[0] = root;
        for(int i = 1; i<nums.length; i++){
           nums[i] = sc.nextInt();
        }
        Node NodeRoot = build(nums);
        System.out.println(NodeRoot);
        zigzag(NodeRoot);

    }
    
}
