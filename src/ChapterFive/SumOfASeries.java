package ChapterFive;
/*
(The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 ... n, where
n ranges from 1 to 100. Use type long . Display the results in a tabular format that shows n and the
corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
with the variable that accumulates the product?
 */
public class SumOfASeries {
    public static void main(String[] args) {

        long sum = 0;
        System.out.println("n\t\t\tsum");
        int number = 1;
        for (; number <= 100; number++){
            sum+=number;
            System.out.printf("%d\t\t\t%d",number, sum);
            System.out.println();
        }
    }
}
