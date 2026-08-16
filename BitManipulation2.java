public class BitManipulation2 {
    //Set Bit 
    public static void main(String args[]){
        int n = 5;
        int pos =1;
        int bitMask = 1<<pos;
        
        int New_Number = bitMask | n;
        System.out.println(New_Number);
    }
}
