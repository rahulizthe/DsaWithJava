//Pattern problem 1- Solid rectangle.
public class Pattern1 {
    //here we are using the concept of nested looping in java
    public static void main(String args[]){
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
