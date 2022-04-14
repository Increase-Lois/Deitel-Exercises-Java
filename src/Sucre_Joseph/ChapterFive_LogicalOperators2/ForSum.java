package Sucre_Joseph.ChapterFive_LogicalOperators2;
/*
Summing integers with the for statement.
sum the even integers from 2 to 20 and store
the result in an int variable called total .
 */
public class ForSum {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 2; number <= 20; number+= 2){
            total+=number;
        }
        System.out.printf("Sum is %d%n", total);
    }
}
