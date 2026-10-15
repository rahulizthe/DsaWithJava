public class Pattern16 {
    public static void main(String[] args) {
        int n = 5; // Set to 5 to show up to 3 spaces

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print '*' only at the first column (j == 1) or last column (j == i)
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after finishing each row
            System.out.println();
        }
    }
}