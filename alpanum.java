public class alpanum {
    
    public static void main(String[] args) {
        int n = 6; // number of rows

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // Odd rows → numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                // Even rows → alphabets
                char ch = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println(); // move to next line
        }
    }
}
    

