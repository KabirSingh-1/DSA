package Must_Practice;
public class PrimLogic {
        public static boolean prim(int num){
        boolean prime  = true;
            if(num <=1) return false;
            for(int j = 2; j<=Math.sqrt(num); j++){
                if(num%j==0)return false;
                break;
        
            
        }
       return prime;
    }
    
}
