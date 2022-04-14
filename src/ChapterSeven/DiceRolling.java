package ChapterSeven;

import java.security.SecureRandom;

/*
(Dice Rolling) Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
each possible sum appears. Display the results in tabular format.
1 2 3 4 5 6

1 2 3 4 5 6 7

2 3 4 5 6 7 8

3 4 5 6 7 8 9

4 5 6 7 8 9 10
5 6 7 8 9 10 11
6 7 8 9 10 11 12
 */
public class DiceRolling {
    //    public static void main(String[] args) {
//
//        SecureRandom randomNumber = new SecureRandom();
//        int [] array = new int[7]
//                sum = 0;
//        for (i = 0; i <= 30_000_000; i++){
//            ++array [1 + randomNumber.nextInt(6)]
//        }
//    }
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7]; // array of frequency counters
// roll die 60,000,000 times; use die value as frequency index
        for (int roll = 1; roll <= 60_000_000; roll++) {
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "Face", "Frequency");
// output each array element's value
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}
