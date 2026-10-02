public class rollno {
    public static void main(String[] args) {
        int[] arr ={81,20,30,40,50,67, 10,7,8,9};
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<35)
            System.out.print(i + " ");
        }
    }
}
