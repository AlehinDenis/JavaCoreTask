import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Solution {
    public static void main(String[] args) throws IOException {

        // Entering array size
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a array size(>= 10):");
        int arrSize = 0;
        do {
            try {
                arrSize = Integer.parseInt(reader.readLine());
                if(arrSize < 10)
                    System.out.println("This is less than 10. Try again:");
            } catch (NumberFormatException exception) {
                System.out.println("This is not integer. Try again:");
            }
        } while(arrSize < 10);

        // Declaration of a variable
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
            array[i] = i + 1;

        // Choosing an element to remove
        Random rand = new Random();
        int elementToBeRemoved = rand.nextInt(arrSize);

        // Deleting the element
        int [] newArray = new int[arrSize - 1];
        for (int i = 0; i < arrSize - 1; i++)
            newArray[i] = array[i < elementToBeRemoved? i: i+1];

        

    }
}
