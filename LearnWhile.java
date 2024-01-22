//import java.util.Scanner;
public class LearnWhile {

    // static final int END_LOOP = 10; 
    // static  int START_LOOP = 0;


    static public void main(String[] aStrings){

        // while (START_LOOP <= END_LOOP) {
        //     System.out.println(" THIS IS PRINTING IN WHILE kjkjl!" + (START_LOOP)+" "+(END_LOOP));
        //     START_LOOP = START_LOOP + 1;
        // }

            // Scanner input = new Scanner(System.in);
            // System.out.println("----enter a number to print----");
            // int number = input.nextInt();
            // System.out.println();
            // System.out.println(number+"-----is captured !------");

            // for(; number >=0; number = number - 5){
            //     System.err.println(number);
            //     input.close();
            // }



            for(int run = 2; run <=30; run+=2){
                if (run == 14)
                    break;
                else
                    if (run == 20) 
                        continue;
                        System.out.println("runs " + run + " times ");   
                   
            }




    }
}
