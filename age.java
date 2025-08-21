import java.util.*;
import java.time.*;
public class age {
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the birth year");
        int birth = sc.nextInt();
        int current = Year.now().getValue();
        int age = current  - birth;
        System.out.println("The age is "+age);
}
    
}
