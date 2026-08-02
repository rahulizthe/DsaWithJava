//Learning the array concept in java.
public class Array1 {
    public static void main(String args[]){
        int[] marks = new int[3];//Syntax
        marks[0] = 95;//physics
        marks[1] =97;//chemistry
        marks[2]= 96;//maths

        //Another way to define Array[]
        //<----------------------------->
        //int marks[] = {98,99,100};


        //System.out.println("your chemistry marks are: "+marks[2]);
        //<--------------------------------->OR
        //using FOR loop to print all the marks.
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }

    }
    
}
