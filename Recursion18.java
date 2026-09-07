public class Recursion18 {
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char CurrChar = str.charAt(idx);    

        //To Be.
        subsequences(str, idx+1, newString + CurrChar);

        //Not To Be.
        subsequences(str, idx+1, newString);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str, 0, "");
    }
}
