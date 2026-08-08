public class StringBuilder1 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //method 1
        System.out.println(sb.charAt(0));

        //method 2 - replacing the index value
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //method 3 - inserting an element 
        sb.insert(0,'S');
        System.out.println(sb);
    }
}
