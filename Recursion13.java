public class Recursion13{
    //Print the String in reverse order using recursion.
    public static void PrintReverse(String str,int index){
        if(index==0){
            //if index becomes 0 then print the last element of the string.
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        PrintReverse(str,index-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        PrintReverse(str,str.length()-1);
    }

}
