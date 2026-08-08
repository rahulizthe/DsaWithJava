import java.util.*;
//replacing "e" with "i" in an given string.
public class string8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("print your string: ");
        String str = sc.next();
        String result = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);


    }
}
