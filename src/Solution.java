import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a array size(>= 10):");

        // Entering array size
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


    }
}
