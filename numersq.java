import java.util.Scanner;

public class numersq {
     public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter n");
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= var2; ++var3) {
         for(int var4 = 1; var4 <= var2; ++var4) {
            System.out.print((char)(var4 + 47) + "   ");
         }

         System.out.println();
      }
   }
}
