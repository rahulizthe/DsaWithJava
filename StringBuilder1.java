public class StringBuilder1 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //method 1
        System.out.println(sb.charAt(0));

        //method 2 - replacing the index value
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //method 3 - inserting an index value 
        sb.insert(0,'S');
        System.out.println(sb);

        //method 4 - deleting an index value 
        sb.delete(0,1);
        System.out.println(sb);

        //method 5
        sb.append(" Stark");
        System.out.println(sb);

        }
}
