import java.util.Scanner;

public class compositetri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n)
                    System.out.print(j + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
