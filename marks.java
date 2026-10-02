import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter marks : ");
        int n =sc.nextInt();
        if(n>=81) System.out.println("very good");
        if(n>=61 && n<=80) System.out.println("good");
        if(n>=41 && n<=60) System.out.println("average");
        if(n<=40) System.out.println("fail");
        
    }
}
