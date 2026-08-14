public class Operators1 {
    //here we are seeing the operators in java.
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        //here are the binary--Arithematic operators
        //1
        int add =  a + b ;
        System.out.println(add);
        //2
        int sub = a-b;
        System.out.println(sub);
        //3
        int mul = a*b;
        System.out.println(mul);
        //4
        int div = a/b;
        System.out.println(div);
        //5
        int mod = a%b;
        System.out.println(mod);

        //Here are the Unary ones
        //1
        System.out.println(a++);//means a+1
        //2 
        System.out.println(b--);//means b-1

        int c = 10;
        c += 5;       // Equivalent to c = c + 5; (c becomes 15)
        c--;          // Decrement by 1 (c becomes 14)
        boolean z = !true; // Logical complement: false     

    }
}
