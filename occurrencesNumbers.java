import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class occurrencesNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();
        Boolean test = true;
        int occurNum = 0;

  while(test)
        {
            System.out.println(" Enter a number (To end the program type 'End')");
            try{
                int i = input.nextInt();
                array.add(i);
                if ( i >=0 &&  i <=50) {
                    occurNum++;
                }

            }
            catch (InputMismatchException ex) {
                break;
            }
        }

    // Print all input has been processed and all values
        System.out.format("All entered numbers :\n" + array + "\n");
        System.out.format("Occurances values of in-range numbers:\n" + occurNum +"\n");
    }
}
