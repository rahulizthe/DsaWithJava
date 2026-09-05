public class Recursion16 {
    public static void MoveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char CurrentChar = str.charAt(idx);
        if(CurrentChar == 'x'){
            count++;
            MoveAllX(str, idx+1, count, newString);
        }else{
            newString += CurrentChar; //newString = newString + CurrentChar;
            MoveAllX(str, idx+1, count, newString);
        }

    }
    public static void main(String args[]){
        String str = "axbcxxd";
        MoveAllX(str, 0, 0, "");

    }
}
