package ChapterFour;
/*
(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
        a total of $650. Youve been supplied with a list of the items sold by each salesperson. The values of
        these items are shown in Fig. 4.33. Develop a Java application that inputs one salespersons items
        sold for last week and calculates and displays that salespersons earnings. Theres no limit to the num-
        ber of items that can be sold.
 */
import java.util.Scanner;

public class SalesCommCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item sold between 1 and 4 and negative value to exit ");
        int userEntry = input.nextInt();
        int fixedSalary =200;
        double totalValue = 0.0;
        double price = 0;

        while (userEntry > 0 && userEntry < 5) {
            if (userEntry == 1) {
                price = 239.99;
            } else if (userEntry == 2) {
                price = 129.75;
            } else if (userEntry == 3) {
                price = 99.95;
            } else if (userEntry == 4) {
                price = 350.89;
            }
//            switch (userEntry) {
//                case 1 -> price = 239.99;
//                case 2 -> price = 129.75;
//                case 3 -> price = 99.95;
//                case 4 -> price = 350.86;
//
//            }
            totalValue += price;
            System.out.println("Enter the items sold between 1 and 4 and negative value to exit: ");
            userEntry = input.nextInt();
        }

            double totalSalary = fixedSalary +( 0.09 * totalValue);
            System.out.println(totalSalary);
            }
        }


