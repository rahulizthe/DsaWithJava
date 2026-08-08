public class string6 {
    //substring method
    public static void main(String args[]){
        String sentence ="My name is tony";
        String sbString = sentence.substring(11,sentence.length());
        System.out.println(sbString);

        //parsing in java
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //tostring method - do not print the hashcode
        int number1 = 123;
        String str1 = Integer.toString(number1);
        System.out.println(str1.length());

      
    }        
}
