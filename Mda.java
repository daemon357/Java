public class Mda {


public static void main(String[] args){
    final int ROWS = 3;
    final int COLS = 4;

    int nums[][] = new int[3][4];

    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
            int value = 1;
            nums[i][j] = value = value +1;
        }
    }
    



    for (int i = 0; i <ROWS; i++) {
        for (int j = 0; j <COLS; j++) {

            System.out.print(nums[i][j]);
        }
        System.out.println();
    }
 

}


}
