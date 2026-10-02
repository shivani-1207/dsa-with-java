import java.util.ArrayList;

public class pairS2 {
    public static boolean pairSum(ArrayList<Integer> var1, int target){
        int bp=-1;
         int n = var1.size();

        for(int i=0; i<var1.size(); i++){
           if(var1.get(i)> var1.get(i+1)){
            bp =i;
            break;
           }
        }
        int lp = bp+1; // smallest
        int rp =bp; // largest

        while(lp!= rp){ // o(n)
            //case1
            if(var1.get(lp) + var1.get(rp) == target){
                return true;
            }
            //case 2
           if(var1.get(lp) + var1.get(rp) < target){
            lp = (lp+1)% n;
           }else{
            //case3
            rp = (n+rp-1)%n;
           }
        }
        return false;
    }
    public static void main(String[] args) {
      ArrayList<Integer>  var1 = new ArrayList();
      var1.add(11);
      var1.add(15);
      var1.add(6);
      var1.add(8);
      var1.add(9);
      var1.add(10);
     
      int target =14;
      System.out.println(pairSum(var1,target));
   
   
    }
    
}
