package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter the number inputs please ");
        System.out.println("Press non-string or EOF to terminate ");

        while (scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);

        int index = indexGen.nextInt(nums.length);
        System.out.println("Index is "+index);
        System.out.println("Value at the generated index is "+nums[index]);

        scan.close();
    }
}
