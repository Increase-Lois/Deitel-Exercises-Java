package DeitelCodes_Java.ChapterSix__Methods;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        //loop 20x
        for (int counter = 1; counter <= 20; counter++){
            //pick random integer from 1 to 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            //if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
