import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BottomView {
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
    static class pair{
        int height;
        Node node;
        pair(int height,Node node){
            this.height = height;
            this.node = node;
        }
    }

    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(0,root));
        while(!queue.isEmpty()){
            pair p = queue.poll();
            Node node = p.node;
            int height = p.height;
            map.put(height, node.data);
            if(p.node.left!=null)queue.add(new pair(height-1, node.left));
            if(p.node.right!=null)queue.add(new pair(height+1, node.right));
        }
        for(int val : map.values()){
            result.add(val);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        System.out.println(bottomView(root));

    }
}
