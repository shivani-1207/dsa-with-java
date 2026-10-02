public class clear {
    // public static int clearIthBits(int n , int i){
    //     int bitmask = (~0)<<i;
    //     return n & bitmask;
    // }
    //clearrangeofbits
//     public static int clearBitsinRange(int n , int i, int j){
//         int a = (~0)<<(j+1);
//         int b = (1<<i) -1;
//         int bitmask = a|b;
//         return n & bitmask ;
//     }
//     public static void main(String[] args) {
//         System.out.println(clearBitsinRange(10, 2 ,4));
//     }
    
// }
// public static boolean isPowerofTwo(int n){
//     return (n&(n-1))== 0;
// }
// public static void main(String[] args) {
//     System.out.println(isPowerofTwo(16));
// }
// }
//countSetBits
public static int countSetBits(int n){
    int count = 0;
    while (n>0) {
        if((n & 1)!=0){
            count++;
        }
       n = n>>1;
     }
     return count;
}
public static void main(String[] args) {
    System.out.println(countSetBits(144));
}
}