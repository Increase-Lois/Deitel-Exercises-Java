package ChapterFive;
/*
(Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3.
 */
public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number < 30; number++) {
            if (number % 3 == 0) {
                sum += number;
                System.out.printf("%d ",number);
            }
        }
        System.out.println();
        System.out.printf("The sum of all numbers divisible by 3 is %d", sum);
        System.out.println();
    }

}
