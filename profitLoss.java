import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price : ");
        int cp =sc.nextInt();
        System.out.println("enter selling price :");
        int sp =sc.nextInt();
        if(sp>cp){
            System.out.println("profit is");
            System.out.println(sp-cp);

        }
        if(cp>sp) System.out.println("loss is" +(cp-sp));
        if(cp==sp) System.out.println("no profit no loss");
    }    
}
