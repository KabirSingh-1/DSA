package Implementations;


import java.util.LinkedList;
import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n- nodes
        private int N; // N- buckets.length;
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(int key){
           int bi = Integer.hashCode(key);
           return Math.abs(bi)%N;
        }
        public void put(K key ,V value){
            int bi = hashFunction(key);
            int di = searchInLL(key ,bi); // di = -1
            if(di == -1){ // key does not exits 
               buckets[bi].add(new Node(key, value));
            }
            else{
                Node data = buckets[bi].get(di);
                data.value = value;
            }
            double lambda  = (double)n/N;
            if(lambda>2.0){
                // reHashing
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
