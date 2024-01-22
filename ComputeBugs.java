
import java.util.Scanner;
public class ComputeBugs {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Enter the volume of house.");
        int volOfHouse = input.nextInt();
        System.out.println("Enter the number of in the house now.");
        int intNumbOfbug = input.nextInt();
        double volOfBug = 0.002;
        double growthRatePweek = 0.95;
        double numbOfBug = volOfBug * intNumbOfbug;
        double  volBugsPweek = numbOfBug * (int)growthRatePweek;
        int weekcount=1;

        while (weekcount<=volOfHouse) {
            System.out.println(volBugsPweek);
            weekcount++;
        }
    
  }

}
