package ChapterSix;

import java.util.Scanner;

/*
Write a method sportsRecommender that inputs a Celsius temperature and returns “It’s
lovely weather for sports today!” if it’s 20–30 °C, “It’s reasonable weather for sports today.” if it’s
10–40 °C, and “Please exercise with care today, watch out for the weather!” otherwise. Create an
application to test the method.
 */
public class SportsRecommender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int userInput = scanner.nextInt();
        celsiusTemp(userInput);
    }

    static void celsiusTemp(int celsius) {
        if (celsius >= 20 && celsius <= 30) {
            System.out.println("It's lovely weather for sports today.");
        }
            if (celsius >= 10 && celsius <= 40) {
                System.out.println("It’s a reasonable weather for sports today.");
            }
            if (celsius > 40) {
                System.out.println("Please exercise with care today, watch out for the weather!");
            }
    }
}

