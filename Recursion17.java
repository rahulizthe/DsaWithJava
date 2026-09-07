public class Recursion17 {
    public static boolean[] map = new boolean[26];

    public static void RemoveDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char CurrChar = str.charAt(idx);
        if(map[CurrChar - 'a'] == true){ //Can Automatically implied true like this if(map[CurrChar - 'a']).
            RemoveDuplicates(str, idx+1, newString);
        }else{
            newString += CurrChar;
            map[CurrChar - 'a'] = true;
            RemoveDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        String str = "abbccda";
        RemoveDuplicates(str, 0, "");
    }
}
