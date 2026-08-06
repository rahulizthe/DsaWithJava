public class string3 {
    //comparing two strings in java
    public static void main(String args[]){
        String name1 = "rahul";
        String name2 = "rahul";

        //Compares three things
        //1 s1>s2 : returns +ve value
        //2 s1==s2 : returns 0
        //3 s1<s2 : returns -ve value

        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal.");
        }else{
            System.out.println("strings are not equal.");
        }

    }
}
