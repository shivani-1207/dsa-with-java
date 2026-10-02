import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target element");
        int x=sc.nextInt();
        System.out.println("enter array size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print(" enter array elements :");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i] ==x){
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.println("element found");
        else System.out.println("element not found");
    }
}
