public class Recursion14 {
    //finding the occurance of a element in a string using recursion.
    public static int first = -1;
    public static int last = -1;

    public static void FindOccurance(String str, int index, char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char CurrentChar = str.charAt(index);
        if(CurrentChar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        FindOccurance(str, index+1, element);

    }
    public static void main(String args[]){
        String str = "abaacdaefaah";
        FindOccurance(str,0,'a');
    }
}
