import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArbitraryNumbers {
    public static void main (String args[])
    {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();

        while((number!=1985))
        {
            System.out.println("Enter Number (1985 to quit):");
            number = scan.nextInt();
            if ( (number>=0)&&(number<=50) )
            {
                nums.add( number );
            }
            else if(number==1985)
            {
                break;
            }
            else
            {
                System.out.println("Number must be between 1-50 inclusive!");
                continue;
            }
        }
        //Iterate linked list
        HashMap<Integer, Integer> intCount = new HashMap<Integer, Integer>();

        for (int i : nums){
            if(intCount.containsKey(i)){
                intCount.put(i, intCount.get(i) + 1);
            }
            else{
                intCount.put(i,1);
            }
        }

        for(Map.Entry entry : intCount.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Take care!");
    }
}
