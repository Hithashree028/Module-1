import java.util.*;
class marks{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of 3 subject");
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c  = sc.nextFloat();
    
    float Total = a+b+c;
    float average = Total/3;
    System.out.println("The total marks is "+Total);
    System.out.println("The average marks is "+average);

    }

}

