public class geti {
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        // if((n&bitmask) == 0){
        //     return 0;
        // } else {
        //     return 1;
        // }
        return n &bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10 ,1));
    }    
}
