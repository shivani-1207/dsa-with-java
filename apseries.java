import java.util.Scanner;

public class apseries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int a=3,d=2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;
           //3 5 7 9 11 ....
        }
        
    }
}


