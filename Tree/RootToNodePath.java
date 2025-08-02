import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class RootToNodePath {
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
    static Node builfTree(int nums[]){
        Node root = new Node(nums[0]);
        int n = nums.length;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(i<n){
            Node currNode = queue.poll();
            if(i<n){
                currNode.left = new Node(nums[i++]);
                queue.add(currNode.left);
            }
            if(i<n){
                currNode.right = new Node(nums[i++]);
                queue.add(currNode.right);
            }
        }
        return root;
    }
    static boolean helper(Node root,ArrayList<Integer> list , int x){
        if(root == null) return false;
        list.add(root.data);
        if(root.data == x){
            return true;
        }
        if(helper(root.left, list, x) || helper(root.right, list, x)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
 static ArrayList<Integer> rootToNodePath(Node root , int x){
    ArrayList<Integer> list = new ArrayList<>();
    if(root == null) return list;
    helper(root, list, x);
    return list;
 }
 static ArrayList<ArrayList<Integer>> allPathToLeaf(Node root, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> allpath){
    if(root == null) return allpath;
    list.add(root.data);
    if(root.left == null && root.right == null){
        allpath.add(new ArrayList<>(list));
    }
    else{
        allPathToLeaf(root.left, list, allpath);
        allPathToLeaf(root.right, list, allpath);
    }
    list.remove(list.size()-1);
    return allpath;
 }

 static List<String> binaryTreePaths(Node root) {
       List<String> result = new ArrayList<>(); 
       if(root == null) return result;
       helper1(root,"",result);
       return result;
    }
    static boolean helper1(Node root, String path, List<String> result){
        if(root == null) return false;
        path+=root.data;
        if(root.left == null && root.right== null){
            result.add(path);
        }
        else{
            path+="->";
            helper1(root.left,path,result);
            helper1(root.right,path,result);
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        Node root = builfTree(nums);
        System.out.println(root.data);

        System.out.println(rootToNodePath(root, 5));

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result1 = allPathToLeaf(root, new ArrayList<>(), result);
        System.out.println(result1);
        System.out.println(binaryTreePaths(root)); 
    }
}
