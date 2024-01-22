
import java.util.*;
public class ScannerLoop {

     
    
    public static void main(String[] args) {
 
       // using nested loops 
       // a while loop program to print even numbers 

       int number;
       int runs = 0;
       Scanner input = new Scanner(System.in);
       number = input.nextInt();
       while (runs < 20) {
        if (number % 2 == 0) {
            System.out.println(number + "is an even number !");
        }else
           System.out.println("is an odd number !");
           input.close();
           runs++;
       }
        
        
       






    }

}
