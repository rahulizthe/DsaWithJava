public class string4 {
    //Why not we use == operator rather than compareTo() method.
    public static void main(String args[]){
        //here is why
        if(new String("tony")==(new String("tony"))){
            System.out.println("string are equal.");
        }else{
            System.out.println("string are not equal.");
        }
    }
}