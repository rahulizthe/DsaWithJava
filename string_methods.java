public class string_methods {
    public static void main(String args[]){
        String fullname = "Tony Stark";
        //method 1: length()
        System.out.println("Length of the string is: " + fullname.length());
        //method 2: charAt()
        for(int i=0; i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
    
}
