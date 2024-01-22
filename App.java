/**
 * Class App
 *
 * <p>This class demonstrates a simplified version of the FizzBuzz game.
 * It determines whether a given number is divisible by specific values and prints.
 * corresponding output.
 */

public class App {

    /**
     * Represents a value to check for divisibility.
     * Note: It's unconventional to use 'odd' for a value of 2.
     */
    

    /**
     * Represents another value to check for divisibility.
     * Note: It's unconventional to use 'even' for a value of 3.
     */
   

    /**
     * Prints "Fizz" if the given number is divisible by {@code odd},
     * otherwise prints "buzz".
     *
     * @param printFizzBuzz The number to check for divisibility.
     */
    static void printFizzOrBuzz(int printFizzBuzz) {
    
        if (printFizzBuzz % 2 == 0) {
            System.out.println("This is an even number: "+ " Fizz");
        } else {
            System.out.println("This is an odd number : Buzz");
        }
    }

    /**
     * The main method, which serves as the program's entry point.
     *
     * @param args Command-line arguments (not used in this program).
     */

    public static void main(String[] args) throws Exception {
        printFizzOrBuzz(5); // Example usage of the printFizzOrBuzz method
    }
}  


