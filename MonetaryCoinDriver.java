import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MonetaryCoinDriver  {
    public static void main(String[] args) {

		int[] cac = {1,5,10,25};

		Random r =new Random();


		MonetaryCoin myCoin = new MonetaryCoin();
		int tailsValue;
		int sum = 0;
      int countTails = 0;
      int countHeads = 0;

      System.out.println(myCoin);

      for (int i = 0; i < 25 ; i++){
		  	myCoin.flip();
		  	 int randomNumber=r.nextInt(cac.length);

			if (myCoin.isHeads()){

			System.out.println("Heads appeared");
			countHeads++;
		}

      		else{

					tailsValue = cac[randomNumber];
					System.out.println("Value of tails appeared is: " + tailsValue);
					countTails++;

					sum += tailsValue;

}


	 }
	 double average;
	 average = sum / countTails;
		         System.out.println("Total all TAILS numbers appeared : "  + countTails + " times");

		         System.out.println("Total sum of all tails is: "  + sum + " cents");

		          System.out.println("The average of all tails is: "  + average );

 				System.out.println("Total all HEADS numbers appeared: "  + countHeads +" times");
	}
}