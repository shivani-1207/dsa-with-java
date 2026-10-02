import java.util.Scanner;

public class horizontallyfliptri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
              System.out.print((char)(i+64)+ " ");
              //System.out.print(i+" ");
              //System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
