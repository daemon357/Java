//import java.util.*;

import java.util.Scanner;

public class InputLoop {


    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("PLEASE INPUT THE NUMBER TO GET THE MULTIPLICATION TABLE ");
        
        //  int num = input.nextInt();
        //  System.out.println("Number is captured !");

        // int i;
        // for (i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

     
        // for(int even = 2; even <=20; even+=2){
        //     System.out.print(even);
        //     System.out.println();
        // }


        //     System.out.println();
        //     System.out.println("ENGINE HAS STARTED ");
        //    for (int i = 10; i >0 ; i--) {
        //     if (i == 8) {
        //         System.out.println("ignition is about to start " + i);
        //     }else{
        //         System.out.println(i + "........");
        //     }
            
        //    }

        //    System.out.println(" HAS BEEN LAUNCHED ! ");
        

        // for (int i = 0; i <10; System.out.println(i+=2));

/*         int a, b;
        for (a = 1, b = 20; a <= 20; a++, b--)
        System.out.println(a + " " + b);     
        
        






        System.out.print("We are go for launch in T minus ");

        for (int count = 10; count >= 0;System.out.println((count == 8) ? "Ignition sequence start!" : count + "..."),count--);
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have a liftoff!");
 */
Scanner input = new Scanner(System.in);
int number;
number= input.nextInt();
while (number >= 0) {
    if (number==10) {
        break;
    }
    System.out.println(number);
    number++;
}


    }
}
