public class Recursion1 {
    //Recursion - Where a function call itself again and again until it reaches the Base-Case.
    public static void PrintNum(int n){
        System.out.println(n);
        PrintNum(n-1);
    }
    public static void main(String args[]){
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
    }
    
}
