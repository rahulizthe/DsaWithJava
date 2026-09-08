import java.util.HashSet;

public class Recursion19 {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char CurrChar = str.charAt(idx);    

        //To Be.
        subsequences(str, idx+1, newString + CurrChar, set);

        //Not To Be.
        subsequences(str, idx+1, newString, set);
    }
    public static void main(String args[]){ 
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
    
}
