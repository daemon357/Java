import java.util.Scanner;

public class LearnDoWhile {

public static final double GROWTH_RATE = 0.95;
//95% per week
public static final double ONE_BUG_VOLUME = 0.002; //cubic feet
    public static void main(String[] args) {
        /* // using do-loop to print even numbers 
        // in this case i have separated the counter from the number were testing 
        int number=0;
         int runs=0;

        do {
            number=number + 2;
            System.out.println("\n"+number);
            System.out.println("\nIm happy im able to do this offhead !");
            System.out.println();
            runs++;
        } while (runs < 20);
 


        System.out.println("THIS IS THE ONE USING THE 'NUMBER' IS ITS COUNTER AND THE PROBLEM NUMBER ASWELL");

        int numb =0;
        do {
            System.out.println("\n"+numb);
            numb+=2;
        } while (numb <=10); */



        System.out.println("Enter the total volume of your house");
        System.out.print("in cubic feet: ");
        Scanner keyboard = new Scanner(System.in);
        double houseVolume = keyboard.nextDouble();
        System.out.println("Enter the estimated number of");
        System.out.print("roaches in your house: ");
        int startPopulation = keyboard.nextInt();
        int countWeeks = 0;
        double population = startPopulation;
        double totalBugVolume = population * ONE_BUG_VOLUME;
        double newBugs, newBugVolume;
        while (totalBugVolume < houseVolume)
        {
        newBugs = population * GROWTH_RATE;
        newBugVolume = newBugs * ONE_BUG_VOLUME;
        population = population + newBugs;
        totalBugVolume = totalBugVolume + newBugVolume;
        countWeeks++;
        }
        System.out.println("Starting with a roach population of " +startPopulation);
        System.out.println("and a house with a volume of " + houseVolume +" cubic feet,");
        System.out.println("after " + countWeeks + " weeks,");
        System.out.println("the house will be filled with " +(int)population + " roaches.");
        System.out.println("They will fill a volume of " +(int)totalBugVolume + " cubic feet.");
        System.out.println("Better call Debugging Experts Inc.");

    }
}siuod
