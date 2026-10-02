public class sumofarray {
    public static void main(String[] args) {
        int[] arr = {23,34,56,77,88,99};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
