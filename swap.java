import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : " );
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+"  "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"  "+b);
    }
}
