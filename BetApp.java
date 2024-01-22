import java.util.Scanner;
// A bet programme that does not allow the user to bet more than the amount in the bank ;

public class BetApp {
static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    /* int bank = 1000;
    boolean validBet;
    int bet;
    System.out.println("WELCOME TO LIL BETTING APP!");
    do {
       System.out.println("ENTER BET.");
       bet = input.nextInt();
       validBet = true;
       if (bet<=0 || bet > bank) {
        validBet = false;
        System.out.println("Error occured.Check if theres a problem amount u entered.");
       }else
            System.out.println("Good you Bet now !");
    } while (validBet=false);
    System.out.println(bank+" Is Smilling !");  
 */

 int count, number;
 System.out.println("Enter a number");
 Scanner keyboard = new Scanner(System.in);
 number = keyboard.nextInt();
 count = 1;
 while (count <= number)
 {
 System.out.print(count + ", ");
 count++;
 }
 System.out.println();
 System.out.println("Buckle my shoe.");



}
}
