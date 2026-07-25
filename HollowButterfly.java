public class HollowButterfly {
    public static void main(String args[]) {
        int n = 5;
        
        // Upper half
        for(int i = 1; i <= n; i++) {
            // Left wing
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Spaces between wings
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Right wing
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // Lower half
        for(int i = n; i >= 1; i--) {
            // Left wing
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Spaces between wings
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Right wing
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}