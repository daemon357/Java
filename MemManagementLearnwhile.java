
    public class  MemManagementLearnwhile{

        public static void learnWhile(int endLoop) {
 
          int startLoop = 0;
          while (startLoop <= endLoop) {
            // Use StringBuilder for efficient string construction
            StringBuilder message = new StringBuilder();
            message.append("THIS IS PRINTING IN WHILE ! ").append(startLoop).append(" ").append(endLoop);
            System.out.println(message);
            startLoop += 1;
          }
        }
    
        public static void main(String[] args) {
          learnWhile(10); 
        }
      }
      




