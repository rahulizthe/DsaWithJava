public class BitManipulation3 {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int NOT_bitmask = ~(bitmask);

        int New_Number = NOT_bitmask & n;
        System.out.println(New_Number);
    }
}
